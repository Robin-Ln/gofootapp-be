package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.type.TypeCategorie;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_equipe")
public class Equipe {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_eq_id")
    private Integer id;

    @Column(name="i_eq_nom")
    private String nom;

    @ManyToOne
    @JoinColumn (name="v_tc_code")
    private TypeCategorie categorie;

    @ManyToOne
    @JoinColumn (name="i_c_id")
    private Club club;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_equipe_evenement",
            joinColumns = { @JoinColumn(name = "i_eq_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_ev_id") }
    )
    private List<Evenement> evenements;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_utilisateur_equipe",
            joinColumns = { @JoinColumn(name = "i_eq_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_u_id") }
    )
    private List<Utilisateur> utilisateurs;


    // Constructeurs

    public Equipe(String nom, TypeCategorie categorie, Club club) {
        this.nom = nom;
        this.categorie = categorie;
        this.club = club;
    }


    // Methodes


    // Accesseurs


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeCategorie getCategorie() {
        return categorie;
    }

    public void setCategorie(TypeCategorie categorie) {
        this.categorie = categorie;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
