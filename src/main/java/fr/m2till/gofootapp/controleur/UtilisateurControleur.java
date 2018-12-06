package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.dao.UtilisateurRepository;
import fr.m2till.gofootapp.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UtilisateurControleur {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @GetMapping("/utilisateur")
    public List<Utilisateur> all() {

        List<Utilisateur> utilisateurs = new ArrayList<>();

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setMail("robin");
        utilisateur.setMdp("robin");
        utilisateur.setPrenom("robin");

        utilisateurs.add(utilisateur);

        return utilisateurs;
    }

    @GetMapping("/utilisateur/{mail}")
    public Utilisateur one(@PathVariable String mail) {
        return null;
    }

    @PostMapping("/utilisateur")
    public void newUtilisateur(@RequestBody Utilisateur utilisateur) {

    }

    @PutMapping("/utilisateur/{mail}")
    public void replaceUtilisateur(@RequestBody Utilisateur utilisateur, @PathVariable String mail) {

    }

    @DeleteMapping("/utilisateur/{mail}")
    public void deleteUtilisateur(@PathVariable String mail) {

    }
}
