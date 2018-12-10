package fr.m2till.gofootapp.modele.type;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_type_evenement")
public class TypeEvenement {
    // Attributs

    @Id
    @Column(name="i_te_code")
    private String code;

    @Column(name="i_te_libelle")
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
