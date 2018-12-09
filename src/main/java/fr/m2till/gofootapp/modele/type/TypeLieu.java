package fr.m2till.gofootapp.modele.type;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Type_Lieu")
public class TypeLieu {
    // Attributs

    private String code;

    private String libelle;


    // Constructeurs

    public TypeLieu(String code, String libelle) {
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
