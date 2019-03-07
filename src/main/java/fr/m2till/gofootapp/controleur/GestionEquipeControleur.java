package fr.m2till.gofootapp.controleur;

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
import fr.m2till.gofootapp.entity.UserPost;
import fr.m2till.gofootapp.repository.ClubRepository;
import fr.m2till.gofootapp.repository.UserPostRepository;

@RestController
public class GestionEquipeControleur {
	
	@Autowired
	ClubRepository clubrepo;
	
	@Autowired
	UserPostRepository userpost;
	
	@RequestMapping(value = "/be/clubidentraineur", method = RequestMethod.POST)
	@ResponseBody
	public ClubDto getClubEntraineur(@RequestBody Integer idUtilisateur) {
		
		Club club = clubrepo.getClubEntraineur(idUtilisateur);
		
		ClubDto clubdto = new ClubDto();
		clubdto.setId(club.getId());
		
		return clubdto;
	}
	

	@RequestMapping(value = "/be/getListeJoueurClub", method = RequestMethod.POST)
	@ResponseBody
	public UserPostDto getListeJoueurClub(@RequestBody Integer idClub) {
		
		UserPost user = userpost.getLstJoueurClub(idClub);
		
		UserPostDto userposdto = new UserPostDto();
		userposdto.setIdUtilisateur(user.getIdUtilisateur());
		userposdto.setNom(user.getNom());
		userposdto.setPrenom(user.getPrenom());
		userposdto.setRole(user.getRole());
		
		return userposdto;
	}
	
}
