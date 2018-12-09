package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.modele.Login;
import fr.m2till.gofootapp.modele.Utilisateur;
import fr.m2till.gofootapp.modele.type.TypeProfile;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/be/connexion")
public class ConnexionControleur {

    @PostMapping
    @ResponseBody
    public Utilisateur connexion(@RequestBody Login login) {
        return new Utilisateur("Robin", "Louarn", "robin@louarn.fr", new TypeProfile("JO", "Joueur"));
    }

}
