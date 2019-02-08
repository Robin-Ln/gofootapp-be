package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.association.AssEquipeUtilisateur;
import fr.m2till.gofootapp.entity.type.TypeProfile;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

import java.util.List;
import java.util.Objects;


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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="v_tp_code",nullable = false,referencedColumnName="v_tp_code")
    private TypeProfile typeProfile;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="i_l_mail",nullable = false,referencedColumnName="i_l_mail")
	private Login login;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_club_utilisateur",
            joinColumns = { @JoinColumn(name = "i_u_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_c_id") }
    )
    private List<Club> clubs;

    @OneToMany(mappedBy = "utilisateur")
    private List<AssEquipeUtilisateur> assEquipeUtilisateurs;

    // Constructeur
    
    public Utilisateur() {
    	
    }


    // Methodes

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(login, that.login);
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "idUtilisateur=" + idUtilisateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", typeProfile=" + typeProfile +
                ", login=" + login +
                ", clubs=" + clubs +
                '}';
    }

    // Accesseurs


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

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
