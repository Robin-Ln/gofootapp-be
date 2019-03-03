package fr.m2till.gofootapp;

import fr.m2till.gofootapp.entity.*;
import fr.m2till.gofootapp.entity.type.TypeCategorie;
import fr.m2till.gofootapp.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GofootappApplicationTests {

	@Autowired
	InscriptionRepository inscriptionRepository;

	@Autowired
	LoginRepository loginRepository;

	@Autowired
	EntrainementRepository entrainementRepository;

	@Autowired
	EvenementRepository evenementRepository;

	@Autowired
	RegroupementEvenementRepository regroupementEvenementRepository;

	@Autowired
	TypeCategorieRepository typeCategorieRepository;

	@Test
	public void contextLoads() {
		Utilisateur utilisateur = new Utilisateur();

		utilisateur.setNom("louarn");
		utilisateur.setPrenom("Robin");

		Login login = new Login();
		login.setMail("robin.louarn@icloud.com");
		login.setPassword("azerty");
		loginRepository.save(login);
		utilisateur.setLogin(login);

		utilisateur.setAdresse("adresse");

		Utilisateur res = inscriptionRepository.save(utilisateur);

		Utilisateur res2 = inscriptionRepository.getByIdUtilisateur(res.getIdUtilisateur());

		System.out.println(res);
		System.out.println(res2);
	}

	@Test
	public void crerEntrainement() {

		Entrainement entrainement = new Entrainement();

		TypeCategorie typeCategorie = new TypeCategorie("SETest","Ségnore");
		typeCategorieRepository.save(typeCategorie);

		entrainement.setTypeCategorie(typeCategorie);

		RegroupementEvenement regroupementEvenement = new RegroupementEvenement();
		regroupementEvenementRepository.save(regroupementEvenement);
		regroupementEvenement.setEvenements(new ArrayList<>());

		Evenement evenement = new Evenement();
		evenement.setDateDebut(Calendar.getInstance());
		Calendar dateFin = Calendar.getInstance();
		dateFin.add(Calendar.HOUR,2);
		evenement.setDateFin(dateFin);
		evenement.setRegroupementEvenement(regroupementEvenement);
		evenementRepository.save(evenement);

		Evenement evenement2 = new Evenement();
		evenement2.setDateDebut(Calendar.getInstance());
		Calendar dateFin2 = Calendar.getInstance();
		dateFin2.add(Calendar.HOUR,2);
		evenement2.setDateFin(dateFin2);
		evenement2.setRegroupementEvenement(regroupementEvenement);
		evenementRepository.save(evenement2);

		regroupementEvenement.getEvenements().add(evenement);
		regroupementEvenementRepository.save(regroupementEvenement);

		entrainement.setRegroupementEvenement(regroupementEvenement);
		entrainementRepository.save(entrainement);


		List<Entrainement> entrainements = entrainementRepository.findAll();
	}
}
