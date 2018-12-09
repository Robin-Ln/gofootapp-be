package fr.m2till.gofootapp.modele;

public class Equipe {
    // Attributs

    private Integer id;

    private String nom;

    private Categorie categorie;

    private Club club;


    // Constructeurs

    public Equipe(String nom, Categorie categorie, Club club) {
        this.nom = nom;
        this.categorie = categorie;
        this.club = club;
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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
