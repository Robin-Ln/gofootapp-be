package fr.m2till.gofootapp.modele;


import javax.persistence.*;

@Entity
@Table(name = "Score")
public class Score {

    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Score")
    private String id;


    // Constructeur



    // Methodes



    // Accesseurs
}
