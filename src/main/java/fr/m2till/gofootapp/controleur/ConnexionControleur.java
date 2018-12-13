package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.modele.Login;
import fr.m2till.gofootapp.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/be/connexion")
public class ConnexionControleur {

    @Autowired
    LoginRepository loginRepository;

    @PostMapping
    @ResponseBody
    public Boolean connexion(@RequestBody Login login) {

        if( !loginRepository.existsById(login.getMail()) ){
            return false;
        }

        //Login res = loginRepository.findByMail(login.getMail());

        //return login.equals(res);

        return true;

    }

}
