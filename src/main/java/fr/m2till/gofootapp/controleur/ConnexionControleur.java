package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.dao.impl.ConnexionDAO;
import fr.m2till.gofootapp.modele.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/be/connexion")
public class ConnexionControleur {

    @Autowired
    ConnexionDAO connexionDAO;

    @PostMapping
    @ResponseBody
    public Boolean connexion(@RequestBody Login login) {
        return connexionDAO.loginExist(login);
    }

}
