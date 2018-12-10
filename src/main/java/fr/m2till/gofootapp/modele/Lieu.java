package fr.m2till.gofootapp.modele;

import fr.m2till.gofootapp.modele.type.TypeLieu;

import javax.persistence.*;

@Entity
@Table(name = "tb_lieu")
public class Lieu {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_l_id")
    private Integer id;

    @Column(name="i_l_adresse")
    private String adresse;


    @ManyToOne
    @JoinColumn (name="v_tl_code")
    private TypeLieu typeLieu;

    // Constructeurs

    public Lieu(String adresse, TypeLieu typeLieu) {
        this.adresse = adresse;
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


    public TypeLieu getTypeLieu() {
        return typeLieu;
    }

    public void setTypeLieu(TypeLieu typeLieu) {
        this.typeLieu = typeLieu;
    }
}
