package fr.m2till.gofootapp.dao;

import fr.m2till.gofootapp.modele.Login;

public interface IAbstractConnexionDAO {

    Boolean loginExist(Login login);

}
