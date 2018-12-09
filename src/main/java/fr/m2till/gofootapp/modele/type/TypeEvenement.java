package fr.m2till.gofootapp.modele.type;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Type_Evenement")
public class TypeEvenement {
    // Attributs

    @Id
    @Column(name="code_Type_Evenement")
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
