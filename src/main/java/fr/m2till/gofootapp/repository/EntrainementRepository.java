package fr.m2till.gofootapp.repository;

import fr.m2till.gofootapp.entity.Entrainement;
import org.springframework.data.repository.CrudRepository;

import javax.validation.OverridesAttribute;
import java.util.List;


public interface EntrainementRepository extends CrudRepository<Entrainement,Integer> {

	Entrainement save(Entrainement entrainement);

	List<Entrainement> findAll();
	
}
