package fr.m2till.gofootapp.modele;

import javax.persistence.*;

@Entity(name = "tb_utilisateur")
public class Utilisateur {

    // Attributs

    @Id
    @Column(name = "V_U_MAIL", nullable = false, columnDefinition = "VARCHAR(100)")
    private String mail;

    @Column(name = "V_U_NOM", nullable = false, columnDefinition = "VARCHAR(100)")
    private String nom;

    @Column(name = "V_U_PRENOM", nullable = false, columnDefinition = "VARCHAR(50)")
    private String prenom;

    @Column(name= "V_U_MDP", nullable = false, columnDefinition = "VARCHAR(40)")
    private String mdp;

    @ManyToOne
    @JoinColumn(name = "V_TU_CODE_ROLE", referencedColumnName = "V_TU_CODE_ROLE")
    private TypeUtilisateur typeUtilisateur;

    @ManyToOne
    @JoinColumn(name = "I_D_NUMERO", referencedColumnName = "I_D_NUMERO")
    private Disponibilite disponibilite;

    // Costructeur

    public Utilisateur() {
        super();
    }

    public Utilisateur(String mail, String nom, String prenom, String mdp) {
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
    }

    // Accesseurs

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
