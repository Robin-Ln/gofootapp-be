package fr.m2till.gofootapp.controleur;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.m2till.gofootapp.dto.ClubDto;
import fr.m2till.gofootapp.dto.UserPostDto;
import fr.m2till.gofootapp.entity.Club;
import fr.m2till.gofootapp.entity.ClubIDEntraineur;
import fr.m2till.gofootapp.entity.UserPost;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.repository.ClubRepository;
import fr.m2till.gofootapp.repository.UserPostRepository;
import fr.m2till.gofootapp.repository.UtilisateurRepository;

@RestController
public class GestionEquipeControleur {

	@Autowired
	ClubRepository clubrepo;

	@Autowired
	UserPostRepository userpost;
	
	@Autowired
	UtilisateurRepository utirepo;

	@RequestMapping(value = "/be/clubidentraineur", method = RequestMethod.POST)
	@ResponseBody
	public ClubDto getClubEntraineur(@RequestBody String mail) {

		ClubIDEntraineur club = clubrepo.getClubEntraineur(mail);

		ClubDto clubdto = new ClubDto();
		clubdto.setId(club.getIdClubUtilisateur());

		return clubdto;
	}

	@RequestMapping(value = "/be/getListeJoueurClub", method = RequestMethod.POST)
	@ResponseBody
	public List<UserPostDto> getListeJoueurClub(@RequestBody Integer idClub) {

		ArrayList<UserPost> users = new ArrayList<UserPost>(userpost.getLstJoueurClub(idClub));
		List<UserPostDto> userspostdto = new ArrayList<>();

		for (UserPost user : users) {

			UserPostDto userposdto = new UserPostDto();
			userposdto.setIdUtilisateur(user.getIdUtilisateur());
			userposdto.setNom(user.getNom());
			userposdto.setPrenom(user.getPrenom());
			userposdto.setRole(user.getRole());

			userspostdto.add(userposdto);

		}

		return userspostdto;
	}

	@RequestMapping(value = "/be/getListeJoueurTerrain", method = RequestMethod.POST)
	@ResponseBody
	public List<UserPostDto> getListeJoueurTerrain(@RequestBody Integer idClub) {

		ArrayList<UserPost> users = new ArrayList<UserPost>(userpost.getJoueurTerrain(idClub));
		List<UserPostDto> userspostdto = new ArrayList<>();

		for (UserPost user : users) {

			UserPostDto userposdto = new UserPostDto();
			userposdto.setIdUtilisateur(user.getIdUtilisateur());
			userposdto.setNom(user.getNom());
			userposdto.setPrenom(user.getPrenom());
			userposdto.setRole(user.getRole());

			userspostdto.add(userposdto);

		}

		return userspostdto;
	}

	@RequestMapping(value = "/be/Enregistrementequipe", method = RequestMethod.POST)
	@ResponseBody
	public Boolean Enregistrementenbase(@RequestBody Integer[] lesidenregistrés) {
		userpost.deletealljoueurofequipe();
		System.out.println(lesidenregistrés.length);
		for (Integer id : lesidenregistrés) {
			userpost.insertintoequipe(id);
		}
		return true;
	}

	@RequestMapping(value = "/be/getIdOfJoueur", method = RequestMethod.POST)
	@ResponseBody
	public UserPostDto getIDUtilisateur(@RequestBody String nom) {

		Utilisateur user = utirepo.getUserID(nom);

		UserPostDto userposdto = new UserPostDto();
		userposdto.setIdUtilisateur(user.getIdUtilisateur());

		return userposdto;
	}

}
