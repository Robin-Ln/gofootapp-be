package fr.m2till.gofootapp.repository;

import fr.m2till.gofootapp.entity.Entrainement;
import fr.m2till.gofootapp.entity.type.TypeCategorie;
import org.springframework.data.repository.CrudRepository;


public interface TypeCategorieRepository extends CrudRepository<TypeCategorie,String> {

	TypeCategorie save(TypeCategorie typeCategorie);
	
}
