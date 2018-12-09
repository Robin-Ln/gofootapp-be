package fr.m2till.gofootapp.modele;

public class Categorie {
    // Attributs

    private String code;

    private String libelle;


    // Constructeurs

    public Categorie(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }


    // Methodes


    // Accesseurs


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
