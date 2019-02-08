package fr.m2till.gofootapp.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_match")
public class Match {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_ev_id")
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ev_date_debut")
    private Calendar dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ev_date_fin")
    private Calendar dateFin;

    @ManyToOne
    @JoinColumn(name="i_l_id",nullable = false,referencedColumnName="i_l_id")
    private Lieu lieu;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_equipe_match",
            joinColumns = { @JoinColumn(name = "i_ev_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_eq_id") }
    )
    private List<Equipe> equipes;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_e_id")
    private Resultat resultat;


    // Constructeurs

    public Match(Calendar dateDebut, Calendar dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
    
    public Match() {
    	
    }


    // Methodes


    // Accesseurs


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Calendar dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Calendar getDateFin() {
        return dateFin;
    }

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }


	public Lieu getLieu() {
		return lieu;
	}


	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public Resultat getResultat() {
        return resultat;
    }

    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }
}
