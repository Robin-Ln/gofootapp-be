package fr.m2till.gofootapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.m2till.gofootapp.entity.UserPost;

public interface UserPostRepository extends CrudRepository<UserPost,Integer> {
	@Query(value="Select tb_utilisateur.i_u_id,i_u_nom,i_u_prenom,v_p_role FROM tb_utilisateur,tb_ass_club_utilisateur,tb_club,tb_position" + 
			"	WHERE tb_utilisateur.i_u_id=tb_ass_club_utilisateur.i_u_id" + 
			"    AND tb_ass_club_utilisateur.i_c_id=tb_club.i_c_id" + 
			"	 AND tb_club.i_c_id = ?1" + 
			"    AND tb_utilisateur.i_p_id=tb_position.i_p_id", nativeQuery= true)
	UserPost getLstJoueurClub(int club_id);
}