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
	
}
