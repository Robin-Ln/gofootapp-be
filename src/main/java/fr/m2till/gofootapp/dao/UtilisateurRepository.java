package fr.m2till.gofootapp.dao;

import fr.m2till.gofootapp.modele.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, String> {


}
