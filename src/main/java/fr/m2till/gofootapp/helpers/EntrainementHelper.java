package fr.m2till.gofootapp.helpers;

import fr.m2till.gofootapp.dto.EvenementDto;
import fr.m2till.gofootapp.entity.Entrainement;
import fr.m2till.gofootapp.entity.Evenement;

import java.util.ArrayList;
import java.util.List;

public class EntrainementHelper {

    /**
     * Méthodes
     */
    public List<EvenementDto> entityToDto(List<Entrainement> entrainements) {
        List<EvenementDto> evenements = new ArrayList<>();

        for (Entrainement entrainement : entrainements) {

            for (Evenement evenement : entrainement.getRegroupementEvenement().getEvenements()) {
                EvenementDto evenementDto = new EvenementDto();
                evenementDto.setId(evenement.getId());
                evenementDto.setTitle("Entrainement " + entrainement.getTypeCategorie().getLibelle());
                evenementDto.setStart(evenement.getDateDebut());
                evenementDto.setEnd(evenement.getDateFin());
                evenements.add(evenementDto);
            }
        }

        return evenements;
    }
}
