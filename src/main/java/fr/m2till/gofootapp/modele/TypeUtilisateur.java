package fr.m2till.gofootapp.modele;


import javax.persistence.*;

@Entity(name = "tb_type_utilisateur")
public class TypeUtilisateur {


    // Attributs

    @Id
    @Column(name = "V_TU_CODE_ROLE", nullable = false, columnDefinition = "VARCHAR(100)")
    private String codeRole;

    @Column(name = "V_TU_ROLE", nullable = false, columnDefinition = "VARCHAR(100)")
    private String role;

    @Column(name = "I_TU_GESTION_CLUB", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean gestionClub;

    @Column(name = "I_TU_GESTION_EQUIPE", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean gestionEquipe;

    @Column(name = "I_TU_GESTION_BENEVOLE", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean gestionBenevole;

    @Column(name = "I_TU_GESTION_MATERIEL", nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean gestionMateriel;

    // Constructeurs


    public TypeUtilisateur() {
        super();
    }

    public TypeUtilisateur(String codeRole, String role, Boolean gestionClub, Boolean gestionEquipe, Boolean gestionBenevole, Boolean gestionMateriel) {
        this.codeRole = codeRole;
        this.role = role;
        this.gestionClub = gestionClub;
        this.gestionEquipe = gestionEquipe;
        this.gestionBenevole = gestionBenevole;
        this.gestionMateriel = gestionMateriel;
    }

    // Accesserus


    public String getCodeRole() {
        return codeRole;
    }

    public void setCodeRole(String codeRole) {
        this.codeRole = codeRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getGestionClub() {
        return gestionClub;
    }

    public void setGestionClub(Boolean gestionClub) {
        this.gestionClub = gestionClub;
    }

    public Boolean getGestionEquipe() {
        return gestionEquipe;
    }

    public void setGestionEquipe(Boolean gestionEquipe) {
        this.gestionEquipe = gestionEquipe;
    }

    public Boolean getGestionBenevole() {
        return gestionBenevole;
    }

    public void setGestionBenevole(Boolean gestionBenevole) {
        this.gestionBenevole = gestionBenevole;
    }

    public Boolean getGestionMateriel() {
        return gestionMateriel;
    }

    public void setGestionMateriel(Boolean gestionMateriel) {
        this.gestionMateriel = gestionMateriel;
    }
}
