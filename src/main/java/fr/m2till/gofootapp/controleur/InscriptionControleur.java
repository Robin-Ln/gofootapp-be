package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.dto.InscriptionFormDto;
import fr.m2till.gofootapp.entity.Login;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.helpers.InscriptionHelper;
import fr.m2till.gofootapp.repository.InscriptionRepository;
import fr.m2till.gofootapp.service.login.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;


@RestController
@RequestMapping(value = "/be/inscription")
public class InscriptionControleur {

    @Autowired
    ILoginService loginService;

    @Autowired
    InscriptionRepository inscriptionRepository;

    @GetMapping(value = "/{mail}")
    @ResponseBody
    public Boolean connexion(@PathVariable String mail) {
        return loginService.existsByMail(mail);
    }

    @PostMapping
    @ResponseBody
    public Boolean connexion(@RequestBody InscriptionFormDto inscriptionForm) {
        Utilisateur utilisateur = InscriptionHelper.InscriptionFormDtoToEntity(inscriptionForm);
        this.loginService.save(utilisateur.getLogin());
        Utilisateur utilisateurSave = this.inscriptionRepository.save(utilisateur);
        return utilisateur.equals(utilisateurSave);
    }

}
