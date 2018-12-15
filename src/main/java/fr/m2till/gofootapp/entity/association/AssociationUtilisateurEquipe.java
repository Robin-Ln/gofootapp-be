package fr.m2till.gofootapp.entity.association;

import fr.m2till.gofootapp.entity.Equipe;
import fr.m2till.gofootapp.entity.Utilisateur;

import javax.persistence.*;


@Entity
@Table(name = "tb_ass_utilisateur_equipe")
public class AssociationUtilisateurEquipe {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_aue_id")
    private Integer id;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="i_u_id")
    private Utilisateur utilisateur;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="i_eq_id")
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
