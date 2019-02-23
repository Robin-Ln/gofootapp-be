package fr.m2till.gofootapp.helpers;

public interface Converteur <Dto, Entite>{

    /**
     * Méthodes
     */

    Entite dtoToEntity(Dto dto);

    Dto entityToDto(Entite entite);

}
