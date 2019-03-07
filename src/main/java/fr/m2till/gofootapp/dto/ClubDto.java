package fr.m2till.gofootapp.dto;

public class ClubDto {
	
	private int id;
	private String nom;
	private int nombreAdherent;
	private EquipeDto[] equipes;
	
	public ClubDto() {
		
	}
	
	
	public ClubDto(int id ,String nom, int nombreAdherent, EquipeDto[] equipe) {
		super();
		this.id=id;
		this.nom = nom;
		this.nombreAdherent = nombreAdherent;
		this.equipes = equipe;
		
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
	public EquipeDto[] getEquipe() {
		return equipes;
	}
	public void setEquipe(EquipeDto[] equipe) {
		this.equipes = equipe;
	}
	
	

}
