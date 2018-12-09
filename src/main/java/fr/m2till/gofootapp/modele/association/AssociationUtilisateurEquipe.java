package fr.m2till.gofootapp.modele.association;

import fr.m2till.gofootapp.modele.Equipe;
import fr.m2till.gofootapp.modele.Utilisateur;

public class AssociationUtilisateurEquipe {
    // Attributs

    private Utilisateur utilisateur;

    private Equipe equipe;


    // Constructeurs

    public AssociationUtilisateurEquipe(Utilisateur utilisateur, Equipe equipe) {
        this.utilisateur = utilisateur;
        this.equipe = equipe;
    }


    // Methodes


    // Accesseurs


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
