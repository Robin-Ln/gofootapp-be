package fr.m2till.gofootapp.modele;


import javax.persistence.*;

@Entity(name = "tb_diponibilite")
public class Disponibilite {

    // Attributs

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "I_D_NUMERO", columnDefinition = "INT")
    private Integer numero;

    @Column(name = "I_D_JOUER", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean jouer;

    @Column(name = "I_D_ENTRAINER", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean entrainner;

    @Column(name = "I_D_ARBITRER", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean arbitrer;

    @Column(name = "I_D_SERVIR", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean servir;

    @Column(name = "I_D_ACCOMPAGNER", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean accompagner;

    // Constructeur

    public Disponibilite() {
        super();
    }

    public Disponibilite(Boolean jouer, Boolean entrainner, Boolean arbitrer, Boolean servir, Boolean accompagner) {
        this.jouer = jouer;
        this.entrainner = entrainner;
        this.arbitrer = arbitrer;
        this.servir = servir;
        this.accompagner = accompagner;
    }

    // Accesseurs


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean getJouer() {
        return jouer;
    }

    public void setJouer(Boolean jouer) {
        this.jouer = jouer;
    }

    public Boolean getEntrainner() {
        return entrainner;
    }

    public void setEntrainner(Boolean entrainner) {
        this.entrainner = entrainner;
    }

    public Boolean getArbitrer() {
        return arbitrer;
    }

    public void setArbitrer(Boolean arbitrer) {
        this.arbitrer = arbitrer;
    }

    public Boolean getServir() {
        return servir;
    }

    public void setServir(Boolean servir) {
        this.servir = servir;
    }

    public Boolean getAccompagner() {
        return accompagner;
    }

    public void setAccompagner(Boolean accompagner) {
        this.accompagner = accompagner;
    }
}
