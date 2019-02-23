package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.entity.Login;
import fr.m2till.gofootapp.service.login.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@RestController
@RequestMapping(value="/be/planning")
public class PlanningControleur {

    @GetMapping(value = "/{mail}")
    @ResponseBody
    public Boolean connexion(@PathVariable String mail) {
        return null;
    }

}
