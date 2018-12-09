package fr.m2till.gofootapp.modele;


import javax.persistence.*;

@Entity
@Table(name = "Resultat")
public class Resultat {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Resultat")
    private String id;

    private Integer scoreEquipe1;

    private Integer scoreEquipe2;

    @ManyToOne
    @JoinColumn(name = "id_Evenement")
    private Evenement evenement;


    // Constructeurs

    public Resultat(Integer scoreEquipe1, Integer scoreEquipe2, Evenement evenement) {
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;
        this.evenement = evenement;
    }


    // Methodes


    // Accesseurs


    public String getId() {
        return id;
    }

    public void setId(String id) {
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
