package fr.m2till.gofootapp.modele;

import fr.m2till.gofootapp.modele.type.TypeLieu;

public class Lieu {
    // Attributs

    private Integer id;

    private String adresse;

    private Club club;

    private TypeLieu typeLieu;

    // Constructeurs

    public Lieu(String adresse, Club club, TypeLieu typeLieu) {
        this.adresse = adresse;
        this.club = club;
        this.typeLieu = typeLieu;
    }


    // Methodes


    // Accesseurs


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public TypeLieu getTypeLieu() {
        return typeLieu;
    }

    public void setTypeLieu(TypeLieu typeLieu) {
        this.typeLieu = typeLieu;
    }
}
