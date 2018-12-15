package fr.m2till.gofootapp.entity.type;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_type_categorie")
public class TypeCategorie {
    // Attributs

    @Id
    @Column(name="v_tc_code")
    private String code;

    @Column(name="v_tc_libelle")
    private String libelle;


    // Constructeurs

    public TypeCategorie(String code, String libelle) {
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
