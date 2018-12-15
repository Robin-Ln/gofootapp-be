package fr.m2till.gofootapp.entity.association;

import fr.m2till.gofootapp.entity.Club;
import fr.m2till.gofootapp.entity.Utilisateur;

import javax.persistence.*;


@Entity
@Table(name = "tb_ass_club_utilisateur")
public class AssociationClubUtilisateur {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_acu_id")
    private Integer id;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="i_c_id")
    private Club club;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="i_u_id")
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
