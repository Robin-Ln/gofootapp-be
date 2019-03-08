package fr.m2till.gofootapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.m2till.gofootapp.entity.UserPost;
import fr.m2till.gofootapp.entity.Utilisateur;

public interface UserPostRepository extends CrudRepository<UserPost, Integer> {
	
	
	@Query(value = "Select tb_utilisateur.i_u_id,i_u_nom,i_u_prenom,v_p_role FROM tb_utilisateur,tb_ass_club_utilisateur,tb_club,tb_position"
			+ "	WHERE tb_utilisateur.i_u_id=tb_ass_club_utilisateur.i_u_id"
			+ "    AND tb_ass_club_utilisateur.i_c_id=tb_club.i_c_id" + "	 AND tb_club.i_c_id = ?1"
			+ "    AND tb_utilisateur.i_p_id=tb_position.i_p_id", nativeQuery = true)
	List<UserPost> getLstJoueurClub(int club_id);

	@Query(value = "Select tb_utilisateur.i_u_id,i_u_nom,i_u_prenom,v_p_role FROM tb_utilisateur,tb_ass_club_utilisateur,tb_club,tb_position,tb_ass_equipe_utilisateur,tb_equipe"
			+ "	WHERE tb_utilisateur.i_u_id=tb_ass_club_utilisateur.i_u_id"
			+ "    AND tb_ass_club_utilisateur.i_c_id=tb_club.i_c_id" + "	 AND tb_club.i_c_id = ?1"
			+ "    AND tb_utilisateur.i_p_id=tb_position.i_p_id"
			+ "  AND tb_utilisateur.i_u_id=tb_ass_equipe_utilisateur.i_u_id "
			+ "  AND tb_ass_equipe_utilisateur.i_eq_id=tb_equipe.i_eq_id"
			+ "	 AND i_eq_nom='Guingamp'", nativeQuery = true)
	List<UserPost> getJoueurTerrain(int club_id);
	
	@Query(value = "Delete from tb_ass_equipe_utilisateur", nativeQuery = true)
	@Modifying
	@Transactional
	void deletealljoueurofequipe();
	
	@Query(value = "INSERT INTO tb_ass_equipe_utilisateur VALUES(?1,'jou',2)", nativeQuery = true)
	@Modifying
	@Transactional
	void insertintoequipe(int u_id);
	
}