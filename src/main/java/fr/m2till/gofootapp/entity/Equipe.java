package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.association.AssEquipeUtilisateur;
import fr.m2till.gofootapp.entity.type.TypeCategorie;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_equipe")
public class Equipe {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_eq_id")
    private Integer id;

    @Column(name="i_eq_nom")
    private String nom;

    @ManyToOne
    @JoinColumn (name="v_tc_code")
    private TypeCategorie categorie;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="i_c_id",nullable = false,referencedColumnName="i_c_id")
    private Club club;

    @ManyToMany(mappedBy = "equipes")
    private List<Match> matchs;

    @OneToMany(mappedBy = "equipe")
    private List<AssEquipeUtilisateur> assEquipeUtilisateurs;


    // Constructeurs

    public Equipe(String nom, TypeCategorie categorie, Club club) {
        this.nom = nom;
        this.categorie = categorie;
        this.club = club;
    }
    
    public Equipe() {
    	
    }


    // Methodes


    // Accesseurs


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

    public TypeCategorie getCategorie() {
        return categorie;
    }

    public void setCategorie(TypeCategorie categorie) {
        this.categorie = categorie;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public void setMatchs(List<Match> matchs) {
        this.matchs = matchs;
    }

    public List<AssEquipeUtilisateur> getAssEquipeUtilisateurs() {
        return assEquipeUtilisateurs;
    }

    public void setAssEquipeUtilisateurs(List<AssEquipeUtilisateur> assEquipeUtilisateurs) {
        this.assEquipeUtilisateurs = assEquipeUtilisateurs;
    }
}
