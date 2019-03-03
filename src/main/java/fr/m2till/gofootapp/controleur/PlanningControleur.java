package fr.m2till.gofootapp.controleur;


import fr.m2till.gofootapp.dto.EvenementDto;
import fr.m2till.gofootapp.entity.Entrainement;
import fr.m2till.gofootapp.helpers.EntrainementHelper;
import fr.m2till.gofootapp.repository.EntrainementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/be/planning")
public class PlanningControleur {

    @Autowired
    EntrainementRepository entrainementRepository;

    @GetMapping(value = "/evenements")
    @ResponseBody
    public List<EvenementDto> getEvenements() {
        List<Entrainement> entrainements = entrainementRepository.findAll();
        List<EvenementDto> evenements = new EntrainementHelper().entityToDto(entrainements);
        return evenements;
    }

}
