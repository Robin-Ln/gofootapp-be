package fr.m2till.gofootapp.dao;

import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.helpers.HQLBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UtilisateurDao {

    @Autowired
    EntityManager entityManager;

    public Utilisateur getUtilisateur(String mail) {

        HQLBuilder builder = new HQLBuilder();

        StringBuilder select = new StringBuilder("user ");
        builder.select(select.toString());

        StringBuilder from = new StringBuilder("Utilisateur user ")
                .append("LEFT JOIN user.login login");
        builder.from(from.toString());


        builder.where("login.mail = :mail");

        Query query =  builder.build(entityManager);

        query.setParameter("mail", mail);

        List<Utilisateur> utilisateurs =  query.getResultList();

        return utilisateurs.get(0);
    }

}
