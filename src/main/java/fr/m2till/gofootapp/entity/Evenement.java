package fr.m2till.gofootapp.entity;

import fr.m2till.gofootapp.entity.type.TypeEvenement;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_evenement")
public class Evenement {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="i_ev_id")
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ev_date_debut")
    private Calendar dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ev_date_fin")
    private Calendar dateFin;

    @ManyToOne
    @JoinColumn (name="i_te_code")
    private TypeEvenement typeEvenement;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "tb_ass_equipe_evenement",
            joinColumns = { @JoinColumn(name = "i_ev_id") },
            inverseJoinColumns = { @JoinColumn(name = "i_eq_id") }
    )
    private List<Equipe> equipes;


    // Constructeurs

    public Evenement(Calendar dateDebut, Calendar dateFin, TypeEvenement typeEvenement) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typeEvenement = typeEvenement;
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

    public TypeEvenement getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(TypeEvenement typeEvenement) {
        this.typeEvenement = typeEvenement;
    }
}
