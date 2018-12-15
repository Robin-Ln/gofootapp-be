package fr.m2till.gofootapp.service.login;

import fr.m2till.gofootapp.entity.Login;

import java.util.Calendar;

public interface ILoginService {

    Login save(Login entity);

    Login findByMail(String mail);

    boolean existsByMailAndPassword(Login login);

}
