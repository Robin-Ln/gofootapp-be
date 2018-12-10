package fr.m2till.gofootapp.modele;


import javax.persistence.*;

@Entity
@Table(name = "tb_resultat")
public class Resultat {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "i_r_id")
    private Integer id;

    @Column(name = "i_r_score_equipe_1")
    private Integer scoreEquipe1;

    @Column(name = "i_r_score_equipe_2")
    private Integer scoreEquipe2;

    @ManyToOne
    @JoinColumn(name = "i_e_id")
    private Evenement evenement;


    // Constructeurs

    public Resultat(Integer scoreEquipe1, Integer scoreEquipe2, Evenement evenement) {
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;
        this.evenement = evenement;
    }


    // Methodes


    // Accesseurs


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScoreEquipe1() {
        return scoreEquipe1;
    }

    public void setScoreEquipe1(Integer scoreEquipe1) {
        this.scoreEquipe1 = scoreEquipe1;
    }

    public Integer getScoreEquipe2() {
        return scoreEquipe2;
    }

    public void setScoreEquipe2(Integer scoreEquipe2) {
        this.scoreEquipe2 = scoreEquipe2;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
}
