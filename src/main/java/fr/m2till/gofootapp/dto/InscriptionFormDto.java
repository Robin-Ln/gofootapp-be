package fr.m2till.gofootapp.dto;

public class InscriptionFormDto {

    /*
     * Attributs
     */
    String nom;
    String prenom;
    String email;
    Integer telephone;
    String password;
    String confirmation;

    /*
     * Constructeur
     */

    public InscriptionFormDto() {
    }

    /*
     * Méthodes
     */

    @Override
    public String toString() {
        return "InscriptionFormDto{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", password='" + password + '\'' +
                ", confirmation='" + confirmation + '\'' +
                '}';
    }
    /*
     * Accesseurs
     */

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }
}
