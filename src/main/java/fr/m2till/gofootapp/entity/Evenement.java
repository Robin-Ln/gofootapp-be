package fr.m2till.gofootapp.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_evenement")
public class Evenement {

    /**
     * Attributs
     */

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_ev_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="i_re_id",nullable = true,referencedColumnName="i_re_id")
    RegroupementEvenement regroupementEvenement;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ev_date_debut")
    private Calendar dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_ev_date_fin")
    private Calendar dateFin;

    /**
     * Constructeur
     */
    public Evenement() {
    }

    /**
     * Accesseurs
     */

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

    public RegroupementEvenement getRegroupementEvenement() {
        return regroupementEvenement;
    }

    public void setRegroupementEvenement(RegroupementEvenement regroupementEvenement) {
        this.regroupementEvenement = regroupementEvenement;
    }
}
