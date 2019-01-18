package fr.m2till.gofootapp.repository;

import fr.m2till.gofootapp.entity.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login,String> {

    Login save(Login Login);

    Login findByMail(String mail);

    boolean existsByMailAndPassword(String mail, String password);

}
