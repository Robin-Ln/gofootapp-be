package fr.m2till.gofootapp.dto;

public class EquipeDto {

	private String nom;
	private String categorie;
	private int nombreUtilisateur;

	public EquipeDto() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getNombreUtilisateur() {
		return nombreUtilisateur;
	}

	public void setNombreUtilisateur(int nombreUtilisateur) {
		this.nombreUtilisateur = nombreUtilisateur;
	}

}
