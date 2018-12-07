package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.modele.Connexion;
import fr.m2till.gofootapp.modele.Utilisateur;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConnexionControleur {

    @PostMapping("/be/connexion")
    @ResponseBody
    public Utilisateur connexion(@RequestBody Connexion connexion) {
        return new Utilisateur(connexion.getEmail(), connexion.getPassword());
    }

}
