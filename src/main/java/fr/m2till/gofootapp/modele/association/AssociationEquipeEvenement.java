package fr.m2till.gofootapp.modele.association;

import fr.m2till.gofootapp.modele.Equipe;
import fr.m2till.gofootapp.modele.Evenement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Association_Equipe_Evenement")
public class AssociationEquipeEvenement {
    // Attributs

    @Id
    private Equipe equipe;

    @Id
    private Evenement evenement;


    // Constructeurs

    public AssociationEquipeEvenement(Equipe equipe, Evenement evenement) {
        this.equipe = equipe;
        this.evenement = evenement;
    }


    // Methodes


    // Accesseurs


    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
}
