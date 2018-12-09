package fr.m2till.gofootapp.modele.association;

import fr.m2till.gofootapp.modele.Equipe;
import fr.m2till.gofootapp.modele.Utilisateur;

import javax.persistence.*;


@Entity
@Table(name = "Association_Utilisateur_Equipe")
public class AssociationUtilisateurEquipe {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Association_Utilisateur_Equipe")
    private Integer id;


    @ManyToOne(fetch=FetchType.LAZY)
    private Utilisateur utilisateur;


    @ManyToOne(fetch=FetchType.LAZY)
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
