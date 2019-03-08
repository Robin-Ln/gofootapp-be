package fr.m2till.gofootapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserPost {
	
	 @Id
	 @Column(name="i_u_id")
	 private Integer idUtilisateur;
	 
	 @Column(name="i_u_nom")
	 private String nom;
	 
	 @Column(name="i_u_prenom")
	 private String prenom;
	 
	 @Column(name="v_p_role")
	 private String role;
	 
	 public UserPost() {}
	 
	 public UserPost(Integer idUtilisateur,String nom,String prenom,String role) {
		 this.idUtilisateur=idUtilisateur;
		 this.nom=nom;
		 this.prenom=prenom;
		 this.role=role;
	 }

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
