package fr.m2till.gofootapp.repository;

import fr.m2till.gofootapp.entity.Evenement;
import fr.m2till.gofootapp.entity.RegroupementEvenement;
import org.springframework.data.repository.CrudRepository;


public interface RegroupementEvenementRepository extends CrudRepository<RegroupementEvenement,Integer> {

	RegroupementEvenement save(RegroupementEvenement regroupementEvenement);
	
}
