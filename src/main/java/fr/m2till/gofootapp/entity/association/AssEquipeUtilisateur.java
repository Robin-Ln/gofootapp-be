package fr.m2till.gofootapp.entity.association;

import fr.m2till.gofootapp.entity.Equipe;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.entity.type.Position;
import fr.m2till.gofootapp.entity.type.TypeProfile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_ass_equipe_utilisateur")
public class AssEquipeUtilisateur implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5787750854317890910L;

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
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="i_p_id",nullable = true,referencedColumnName="i_p_id")
    private Position position;


    /*
     * Constructeur
     */
    public AssEquipeUtilisateur() {
    }

    /*
     * Méthodes
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssEquipeUtilisateur that = (AssEquipeUtilisateur) o;
        return Objects.equals(utilisateur, that.utilisateur) &&
                Objects.equals(equipe, that.equipe) &&
                Objects.equals(typeProfile, that.typeProfile) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilisateur, equipe, typeProfile, position);
    }
    /*
     * Accesseurs
     */

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
    
    
}
