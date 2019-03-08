package fr.m2till.gofootapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClubIDEntraineur {

	@Id
	@Column(name = "i_c_id")
	private Integer idClubUtilisateur;

	public ClubIDEntraineur() {
	}

	public ClubIDEntraineur(Integer idUtilisateur) {
		this.idClubUtilisateur = idUtilisateur;
	}

	public Integer getIdClubUtilisateur() {
		return idClubUtilisateur;
	}

	public void setIdClubUtilisateur(Integer idClubUtilisateur) {
		this.idClubUtilisateur = idClubUtilisateur;
	}

}
