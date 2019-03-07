package fr.m2till.gofootapp.dto;

public class NouveauClubDto {
	private String nom;
	private Integer idUtilisateur;
	
	
	public NouveauClubDto() {
		super();
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
	};
	
	

}
