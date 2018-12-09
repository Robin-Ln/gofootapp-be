package fr.m2till.gofootapp.modele;

public class Resultat {
    // Attributs
    private String id;

    private Score score;

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
