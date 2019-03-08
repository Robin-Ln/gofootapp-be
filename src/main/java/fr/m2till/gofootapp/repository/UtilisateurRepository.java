package fr.m2till.gofootapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.m2till.gofootapp.entity.Utilisateur;

public interface UtilisateurRepository  extends CrudRepository<Utilisateur, Integer> {

	@Query(value = "Select i_u_id,i_u_adresse,i_u_nom,i_u_prenom,v_l_mail,i_p_id FROM tb_utilisateur WHERE i_u_nom=?1", nativeQuery = true)
	Utilisateur getUserID(String nom);


}
