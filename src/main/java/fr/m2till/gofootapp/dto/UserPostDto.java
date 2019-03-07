package fr.m2till.gofootapp.dto;


public class UserPostDto {
	
	 private Integer idUtilisateur;
	 
	 private String nom;
	 
	 private String prenom;
	 
	 private String role;
	 
	 public UserPostDto() {}
	 
	 public UserPostDto(Integer idUtilisateur,String nom,String prenom,String role) {
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
