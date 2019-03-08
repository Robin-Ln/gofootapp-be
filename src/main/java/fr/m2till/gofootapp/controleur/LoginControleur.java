package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.dao.UtilisateurDao;
import fr.m2till.gofootapp.entity.Login;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.entity.type.Position;
import fr.m2till.gofootapp.service.login.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@RestController
@RequestMapping(value="/be/login")
public class LoginControleur {

    @Autowired
    ILoginService loginService;

    @Autowired
    UtilisateurDao utilisateurDao;

    @PostMapping(value = "/user")
    @ResponseBody
    public Integer connexion(@RequestBody String mail) {
        Utilisateur utilisateur = utilisateurDao.getUtilisateur(mail);
        utilisateur.setPosition(new Position(0,""));
        return utilisateur.getIdUtilisateur();
    }

    @PostMapping
    @ResponseBody
    public Boolean connexion(@RequestBody Login login) {

        // verification du login
        if (!loginService.existsByMailAndPassword(login)){
            return false;
        }

        // modification de la date d'expiration
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 10);
        login.setDateExpiration(calendar);
        loginService.save(login);
        return true;
    }

    @PutMapping(value = "/{mail}")
    @ResponseBody
    public Boolean checkLoggedIn(@PathVariable String mail) {
        Login login = loginService.findByMail(mail);

        if (login.getDateExpiration() == null){
            return false;
        }

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(sdf.format(login.getDateExpiration().getTime()));


        if(login.getDateExpiration().compareTo(calendar) < 0){
            return false;
        }

        calendar.add(Calendar.MINUTE, 10);
        login.setDateExpiration(calendar);

        loginService.save(login);

        return true;
    }

}
