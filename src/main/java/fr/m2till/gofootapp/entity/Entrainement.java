package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.type.TypeCategorie;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name = "tb_entrainement")
public class Entrainement {

    /**
     * Attributs
     */
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_en_id")
    private Integer id;

    @OneToOne
    @JoinColumn(name="i_en_regroupement_evenement",nullable = false,referencedColumnName="i_re_id")
    RegroupementEvenement regroupementEvenement;

    @OneToOne
    @JoinColumn(name="i_en_type_categorie",nullable = false,referencedColumnName="v_tc_code")
    TypeCategorie typeCategorie;


    /**
     * Constructeur
     */
    public Entrainement() {
    }

    /**
     * Accesseurs
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RegroupementEvenement getRegroupementEvenement() {
        return regroupementEvenement;
    }

    public void setRegroupementEvenement(RegroupementEvenement regroupementEvenement) {
        this.regroupementEvenement = regroupementEvenement;
    }

    public TypeCategorie getTypeCategorie() {
        return typeCategorie;
    }

    public void setTypeCategorie(TypeCategorie typeCategorie) {
        this.typeCategorie = typeCategorie;
    }
}
