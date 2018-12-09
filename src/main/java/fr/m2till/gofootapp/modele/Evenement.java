package fr.m2till.gofootapp.modele;

import fr.m2till.gofootapp.modele.type.TypeEvenement;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Evenement")
public class Evenement {
    // Attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Evenement")
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateFin;

    @ManyToOne
    @JoinColumn (name="code_Type_Evenement")
    private TypeEvenement typeEvenement;


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
