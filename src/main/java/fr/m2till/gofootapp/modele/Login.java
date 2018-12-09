package fr.m2till.gofootapp.modele;

public class Login {

    // Attributs

    private String mail;

    private String pseudo;

    private String password;

    private Utilisateur utilisateur;

    // Constructeur

    public Login(String mail, String pseudo, String password, Utilisateur utilisateur) {
        this.mail = mail;
        this.pseudo = pseudo;
        this.password = password;
        this.utilisateur = utilisateur;
    }


    // Methodes

    // Accesseurs


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
