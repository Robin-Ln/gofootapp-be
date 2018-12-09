package fr.m2till.gofootapp.modele;

public class Club {
    // Attributs

    private Integer id;

    private String nom;

    private Lieu lieu;


    // Constructeurs

    public Club(String nom, Lieu lieu) {
        this.nom = nom;
        this.lieu = lieu;
    }


    // Methodes


    // Accesseurs


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }
}
