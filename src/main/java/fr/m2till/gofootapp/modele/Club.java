package fr.m2till.gofootapp.modele;


import javax.persistence.*;

@Entity
@Table(name = "Club")
public class Club {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Club")
    private Integer id;

    private String nom;

    @ManyToOne
    @JoinColumn (name="id_Lieu")
    private Lieu lieu;


    // Constructeurs

    public Club(String nom, Lieu lieu) {
        this.nom = nom;
        this.lieu = lieu;
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

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }
}
