package fr.m2till.gofootapp.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_club")
public class Club {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_c_id")
    private Integer id;

    private String nom;

    @ManyToMany(mappedBy = "clubs")
    private List<Utilisateur> utilisateurs;
    
    @OneToMany(mappedBy = "club")
    private List<Equipe> equipes;
    
    @ManyToMany(mappedBy = "clubs")
    private List<Lieu> lieux;
    
    // Constructeurs

    public Club(String nom,  List<Lieu> lieux, List<Utilisateur> utilisateurs) {
        this.nom = nom;
        this.lieux = lieux;
        this.utilisateurs = utilisateurs;
    }
    
    public Club() {
    	
    }


    // Methodes


    // Accesseurs


    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


	public List<Lieu> getLieux() {
		return lieux;
	}


	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }
}
