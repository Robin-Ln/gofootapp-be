package fr.m2till.gofootapp.entity.association;

import fr.m2till.gofootapp.entity.Equipe;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.entity.type.TypeProfile;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_ass_equipe_utilisateur")
public class AssEquipeUtilisateur implements Serializable {

    /*
     * Attributs
     */
    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="i_u_id",nullable = false,referencedColumnName="i_u_id")
    private Utilisateur utilisateur;

    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="i_eq_id",nullable = false,referencedColumnName="i_eq_id")
    private Equipe equipe;

    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="v_tp_code",nullable = false,referencedColumnName="v_tp_code")
    private TypeProfile typeProfile;


    /*
     * Constructeur
     */
    public AssEquipeUtilisateur() {
    }

    /*
     * Accesseurs
     */

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public TypeProfile getTypeProfile() {
        return typeProfile;
    }

    public void setTypeProfile(TypeProfile typeProfile) {
        this.typeProfile = typeProfile;
    }
}
