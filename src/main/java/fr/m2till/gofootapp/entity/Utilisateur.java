package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.type.TypeProfile;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tb_utilisateur")
public class Utilisateur {

    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_u_id")
    private Integer idUtilisateur;

    @Column(name="i_u_nom")
    private String nom;

    @Column(name="i_u_prenom")
    private String prenom;

    @Column(name="i_u_adresse")
    private String adresse;

    @ManyToOne
    @JoinColumn (name="v_tp_code")
    private TypeProfile typeProfile;

    @ManyToOne
    @JoinColumn (name="i_l_mail")
    private Login login;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_club_utilisateur",
            joinColumns = { @JoinColumn(name = "i_u_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_c_id") }
    )
    private List<Club> clubs;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_club_utilisateur",
            joinColumns = { @JoinColumn(name = "i_eq_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_u_id") }
    )
    private List<Equipe> equipes;

    // Constructeur

    public Utilisateur(String nom, String prenom, String adresse, TypeProfile typeProfile, Login login, List<Club> clubs) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.typeProfile = typeProfile;
        this.login = login;
        this.clubs = clubs;
    }


    // Methodes



    // Accesseurs


    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public TypeProfile getTypeProfile() {
        return typeProfile;
    }

    public void setTypeProfile(TypeProfile typeProfile) {
        this.typeProfile = typeProfile;
    }
}
