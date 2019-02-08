package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.type.TypeLieu;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tb_lieu")
public class Lieu {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_l_id")
    private Integer id;

    @Column(name="i_l_adresse")
    private String adresse;

    @ManyToOne
    @JoinColumn(name="v_tl_code",nullable = false,referencedColumnName="v_tl_code")
    private TypeLieu typeLieu;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_club_lieu",
            joinColumns = { @JoinColumn(name = "i_l_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_c_id") }
    )
    private List<Club> clubs;

    // Constructeurs

    public Lieu(String adresse, TypeLieu typeLieu) {
        this.adresse = adresse;
        this.typeLieu = typeLieu;
    }
    
    public Lieu() {
    	
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

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public TypeLieu getTypeLieu() {
        return typeLieu;
    }

    public void setTypeLieu(TypeLieu typeLieu) {
        this.typeLieu = typeLieu;
    }
}
