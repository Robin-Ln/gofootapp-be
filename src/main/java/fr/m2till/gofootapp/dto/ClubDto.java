package fr.m2till.gofootapp.dto;

public class ClubDto {
	
	private int id;
	private String nom;
	private int nombreAdherent;
	private String[] equipe;
	
	public ClubDto() {
		
	}
	
	
	public ClubDto(int id ,String nom, int nombreAdherent, String[] equipe) {
		super();
		this.id=id;
		this.nom = nom;
		this.nombreAdherent = nombreAdherent;
		this.equipe = equipe;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNombreAdherent() {
		return nombreAdherent;
	}
	public void setNombreAdherent(int nombreAdherent) {
		this.nombreAdherent = nombreAdherent;
	}
	public String[] getEquipe() {
		return equipe;
	}
	public void setEquipe(String[] equipe) {
		this.equipe = equipe;
	}
	
	

}
