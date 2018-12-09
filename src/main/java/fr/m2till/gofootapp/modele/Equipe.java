package fr.m2till.gofootapp.modele;

import fr.m2till.gofootapp.modele.type.TypeCategorie;

import javax.persistence.*;

@Entity
@Table(name = "Equipe")
public class Equipe {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Equipe")
    private Integer id;

    private String nom;

    @ManyToOne
    @JoinColumn (name="code_Type_Categorie")
    private TypeCategorie categorie;

    @ManyToOne
    @JoinColumn (name="id_Club")
    private Club club;


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
