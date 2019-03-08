package fr.m2till.gofootapp.dao;

import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.helpers.HQLBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface IUtilisateurDao {

    Utilisateur getUtilisateur(String mail);

}
