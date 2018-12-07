package fr.m2till.gofootapp.modele;

public class Connexion {

    // Attributs

    private String email;

    private String password;

    // Methodes

    @Override
    public String toString() {
        return "Connexion{" +
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
