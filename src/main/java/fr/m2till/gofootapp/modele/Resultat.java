package fr.m2till.gofootapp.modele;


import javax.persistence.*;

@Entity
@Table(name = "Resultat")
public class Resultat {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Resultat")
    private String id;

    @ManyToOne
    @JoinColumn (name="id_Score")
    private Score score;

    @ManyToOne
    @JoinColumn (name="id_Evenement")
    private Evenement evenement;


    // Constructeurs

    public Resultat(Score score, Evenement evenement) {
        this.score = score;
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

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
}
