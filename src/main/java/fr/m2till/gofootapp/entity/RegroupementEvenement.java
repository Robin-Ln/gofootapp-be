package fr.m2till.gofootapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_regroupement_evenement")
public class RegroupementEvenement {

    /**
     * Attributs
     */

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
    @Column(name="i_re_id")
    private Integer id;

    @OneToMany(mappedBy = "regroupementEvenement")
    private List<Evenement> evenements;

    /**
     * Constructeur
     */
    public RegroupementEvenement() {
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

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }
}
