package fr.m2till.gofootapp;

import fr.m2till.gofootapp.entity.Login;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.repository.InscriptionRepository;
import fr.m2till.gofootapp.repository.LoginRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GofootappApplicationTests {

	@Autowired
	InscriptionRepository inscriptionRepository;

	@Autowired
	LoginRepository loginRepository;

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

//		System.out.println(res);
		System.out.println(res2);

		assertTrue(true);
	}
}
