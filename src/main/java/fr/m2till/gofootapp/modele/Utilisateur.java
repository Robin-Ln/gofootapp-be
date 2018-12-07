package fr.m2till.gofootapp.modele;

import javax.persistence.*;

public class Utilisateur {

    // Attributs

    private String email;

    private String password;

    // Constructeur

    public Utilisateur(String email, String password) {
        this.email = email;
        this.password = password;
    }


    // Methodes

    @Override
    public String toString() {
        return "Utilisateur{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    // Accesseurs


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
