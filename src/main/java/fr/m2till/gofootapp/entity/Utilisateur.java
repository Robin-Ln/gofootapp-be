package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.association.AssEquipeUtilisateur;
import fr.m2till.gofootapp.entity.type.TypeProfile;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NaturalId;

import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "tb_utilisateur")
public class Utilisateur {

    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_u_id")
    private Integer idUtilisateur;

    @Column(name="i_u_nom")
    private String nom;

    @Column(name="i_u_prenom")
    private String prenom;

    @Column(name="i_u_adresse")
    private String adresse;


    @ManyToOne
    @JoinColumn(name="v_l_mail",nullable = false,referencedColumnName="v_l_mail")
	private Login login;

    @ManyToMany(fetch=FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_club_utilisateur",
            joinColumns = { @JoinColumn(name = "i_u_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_c_id") }
    )
    private List<Club> clubs;

    @OneToMany(mappedBy = "utilisateur")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<AssEquipeUtilisateur> assEquipeUtilisateurs;

    // Constructeur
    
    public Utilisateur() {
    	
    }


    // Methodes

    @Override
    public String toString() {
        return "Utilisateur{" +
                "idUtilisateur=" + idUtilisateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", login=" + login +
                ", clubs=" + clubs +
                ", assEquipeUtilisateurs=" + assEquipeUtilisateurs +
                '}';
    }


    // Accesseurs
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

    public List<AssEquipeUtilisateur> getAssEquipeUtilisateurs() {
        return assEquipeUtilisateurs;
    }

    public void setAssEquipeUtilisateurs(List<AssEquipeUtilisateur> assEquipeUtilisateurs) {
        this.assEquipeUtilisateurs = assEquipeUtilisateurs;
    }
}
