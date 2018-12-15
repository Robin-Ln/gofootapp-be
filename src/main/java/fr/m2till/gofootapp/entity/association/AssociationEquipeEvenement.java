package fr.m2till.gofootapp.entity.association;

import fr.m2till.gofootapp.entity.Equipe;
import fr.m2till.gofootapp.entity.Evenement;

import javax.persistence.*;


@Entity
@Table(name = "tb_ass_equipe_evenement")
public class AssociationEquipeEvenement {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_aee_id")
    private Integer id;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="i_eq_id")
    private Equipe equipe;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="i_ev_id")
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
