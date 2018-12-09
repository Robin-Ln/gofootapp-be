package fr.m2till.gofootapp.modele.association;

import fr.m2till.gofootapp.modele.Club;
import fr.m2till.gofootapp.modele.Utilisateur;

import javax.persistence.*;


@Entity
@Table(name = "Association_Club_Utilisateur")
public class AssociationClubUtilisateur {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Association_Club_Utilisateur")
    private Integer id;


    @ManyToOne(fetch=FetchType.LAZY)
    private Club club;


    @ManyToOne(fetch=FetchType.LAZY)
    private Utilisateur utilisateur;


    // Constructeurs

    public AssociationClubUtilisateur(Club club, Utilisateur utilisateur) {
        this.club = club;
        this.utilisateur = utilisateur;
    }


    // Methodes


    // Accesseurs


    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
