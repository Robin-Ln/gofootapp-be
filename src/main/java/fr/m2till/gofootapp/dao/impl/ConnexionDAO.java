package fr.m2till.gofootapp.dao.impl;

import fr.m2till.gofootapp.dao.IAbstractConnexionDAO;
import fr.m2till.gofootapp.modele.Login;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ConnexionDAO implements IAbstractConnexionDAO {

    // @Autowired
    // private SessionFactory sessionFactory;

    @Override
    public Login getLogin(Login login) {
        return null;
    }

}
