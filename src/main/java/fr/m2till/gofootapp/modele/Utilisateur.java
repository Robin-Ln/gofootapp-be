package fr.m2till.gofootapp.modele;

import fr.m2till.gofootapp.modele.type.TypeProfile;

import javax.persistence.*;


@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUtilisateur;

    private String nom;

    private String prenom;

    private String adresse;

    private TypeProfile typeProfile;

    // Constructeur

    public Utilisateur(String nom, String prenom, String adresse, TypeProfile typeProfile) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.typeProfile = typeProfile;
    }


    // Methodes



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

    public TypeProfile getTypeProfile() {
        return typeProfile;
    }

    public void setTypeProfile(TypeProfile typeProfile) {
        this.typeProfile = typeProfile;
    }
}
