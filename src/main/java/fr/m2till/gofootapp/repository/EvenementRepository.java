package fr.m2till.gofootapp.repository;

import fr.m2till.gofootapp.entity.Evenement;
import org.springframework.data.repository.CrudRepository;


public interface EvenementRepository extends CrudRepository<Evenement,Integer> {

	Evenement save(Evenement evenement);
	
}
