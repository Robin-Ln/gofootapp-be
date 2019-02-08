package fr.m2till.gofootapp.helpers;

import fr.m2till.gofootapp.dto.InscriptionFormDto;
import fr.m2till.gofootapp.entity.Login;
import fr.m2till.gofootapp.entity.Utilisateur;

import java.util.ArrayList;

public class InscriptionHelper {

    static public Utilisateur InscriptionFormDtoToEntity(InscriptionFormDto inscriptionFormDto){
        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setNom(inscriptionFormDto.getNom());
        utilisateur.setPrenom(inscriptionFormDto.getPrenom());

        Login login = new Login();
        login.setMail(inscriptionFormDto.getEmail());
        login.setPassword(inscriptionFormDto.getPassword());
        utilisateur.setLogin(login);

        utilisateur.setAdresse("");
        utilisateur.setAssEquipeUtilisateurs(new ArrayList<>());
        utilisateur.setClubs(new ArrayList<>());

        return utilisateur;
    }
}
