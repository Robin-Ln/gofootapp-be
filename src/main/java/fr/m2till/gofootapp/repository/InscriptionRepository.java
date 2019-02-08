package fr.m2till.gofootapp.repository;

import fr.m2till.gofootapp.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface InscriptionRepository extends CrudRepository<Utilisateur,Integer> {

    Utilisateur save(Utilisateur utilisateur);

    Utilisateur getByIdUtilisateur(Integer idUtilisateur);

    Boolean existsByIdUtilisateur(Integer idUtilisateur);

}
