package fr.m2till.gofootapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.m2till.gofootapp.entity.Club;


public interface ClubRepository extends CrudRepository<Club,String> {

	Club findByNom(String nom); 
	
	//@Query("SELECT club FROM Club club FETCH ALL properties") -- equivalent
	Iterable<Club> findAll();
	
	Club findById(Integer id);
	
	@Query(value="Select tb_club.i_c_id FROM tb_utilisateur,tb_ass_club_utilisateur,tb_club" + 
			"    WHERE tb_utilisateur.i_u_id=tb_ass_club_utilisateur.i_u_id" + 
			"    AND tb_ass_club_utilisateur.i_c_id=tb_club.i_c_id" + 
			"    AND tb_utilisateur.i_u_id= ?1 ", nativeQuery= true)
	Club getClubEntraineur(int id);
	
}
