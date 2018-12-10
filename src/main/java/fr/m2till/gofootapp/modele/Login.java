package fr.m2till.gofootapp.modele;

import javax.persistence.*;

@Entity
@Table(name = "tb_login")
public class Login {

    // Attributs

    @Id
    @Column(name = "i_l_mail")
    private String mail;

    @Column(name = "i_l_password")
    private String password;


    // Constructeur

    public Login(String mail, String password, Utilisateur utilisateur) {
        this.mail = mail;
        this.password = password;
    }

    // Methodes

    @Override
    public String toString() {
        return "Login{" +
                "mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    // Accesseurs


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
