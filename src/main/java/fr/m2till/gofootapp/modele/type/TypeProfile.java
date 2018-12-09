package fr.m2till.gofootapp.modele.type;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Type_Profile")
public class TypeProfile {
    // Attributs

    @Id
    @Column(name="code_Type_Profile")
    private String code;

    private String libelle;


    // Constructeurs

    public TypeProfile(String code, String libelle) {
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
