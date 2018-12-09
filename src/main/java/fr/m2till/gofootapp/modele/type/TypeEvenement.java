package fr.m2till.gofootapp.modele.type;

public class TypeEvenement {
    // Attributs

    private String code;

    private String libelle;


    // Constructeurs

    public TypeEvenement(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }


    // Methodes


    // Accesseurs


    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }
}
