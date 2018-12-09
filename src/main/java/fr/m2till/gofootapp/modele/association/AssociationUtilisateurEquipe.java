package fr.m2till.gofootapp.modele.association;

import fr.m2till.gofootapp.modele.Equipe;
import fr.m2till.gofootapp.modele.Utilisateur;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Association_Utilisateur_Equipe")
public class AssociationUtilisateurEquipe {
    // Attributs

    @Id
    private Utilisateur utilisateur;

    @Id
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
