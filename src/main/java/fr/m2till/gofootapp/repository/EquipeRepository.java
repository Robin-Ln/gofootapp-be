package fr.m2till.gofootapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.m2till.gofootapp.entity.Club;
import fr.m2till.gofootapp.entity.Equipe;

public interface EquipeRepository extends CrudRepository<Equipe,String> {

	List<Equipe> findByClub(Club club);

}
