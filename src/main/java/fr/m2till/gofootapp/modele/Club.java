package fr.m2till.gofootapp.modele;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_club")
public class Club {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_c_id")
    private Integer id;

    private String nom;

    @ManyToOne
    @JoinColumn (name="i_l_id")
    private Lieu lieu;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_club_utilisateur",
            joinColumns = { @JoinColumn(name = "i_c_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_u_id") }
    )
    private List<Utilisateur> utilisateurs;


    // Constructeurs

    public Club(String nom, Lieu lieu, List<Utilisateur> utilisateurs) {
        this.nom = nom;
        this.lieu = lieu;
        this.utilisateurs = utilisateurs;
    }


    // Methodes


    // Accesseurs


    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

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
