package fr.m2till.gofootapp.controleur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.m2till.gofootapp.dto.ClubDto;
import fr.m2till.gofootapp.dto.InscriptionClubDto;
import fr.m2till.gofootapp.entity.Club;
import fr.m2till.gofootapp.entity.Lieu;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.repository.ClubRepository;
import fr.m2till.gofootapp.repository.InscriptionRepository;

@RestController
public class ClubControleur {

	@Autowired
	private ClubRepository clubRepository;
	
	@Autowired
	private InscriptionRepository inscriptionRepository;

	@RequestMapping(value = "/be/clubNonAdherer" , method= RequestMethod.POST)
	@ResponseBody
	public List<ClubDto> getListeClubNonAdherer(@RequestBody Integer idUtilisateur) {
		Iterable<Club> clubs =clubRepository.findAll();
		List<ClubDto> listeClub=new ArrayList<>();
		Iterator<Club> it=clubs.iterator();
		while(it.hasNext()) {
			Club club=it.next();
			boolean adherent=false;
			for(int x=0;x<club.getUtilisateurs().size();x++) {
				Utilisateur utilisateur =club.getUtilisateurs().get(x);
				if(utilisateur.getIdUtilisateur()==idUtilisateur) {
					adherent=true;
				}
			}
			if(!adherent) {
				listeClub.add(new ClubDto(club.getId(),club.getNom(),club.getUtilisateurs().size(),new String[2]));
			}
		}
		return listeClub;
	}
	
	@RequestMapping(value = "/be/clubAdherer" , method= RequestMethod.POST)
	@ResponseBody
	public List<ClubDto> getListeClubAdherer(@RequestBody Integer idUtilisateur) {
		Iterable<Club> clubs =clubRepository.findAll();
		List<ClubDto> listeClub=new ArrayList<>();
		Iterator<Club> it=clubs.iterator();
		while(it.hasNext()) {
			Club club=it.next();
			boolean adherent=false;
			for(int x=0;x<club.getUtilisateurs().size();x++) {
				Utilisateur utilisateur =club.getUtilisateurs().get(x);
				if(utilisateur.getIdUtilisateur()==idUtilisateur) {
					adherent=true;
				}
			}
			if(adherent) {
				listeClub.add(new ClubDto(club.getId(),club.getNom(),club.getUtilisateurs().size(),new String[2]));
			}
		}
		return listeClub;
	}
	
	
	@RequestMapping(value = "/be/rejoindreClub" , method= RequestMethod.POST)
	@ResponseBody
	public boolean rejoindreClub(@RequestBody InscriptionClubDto inscriptionClub) {
		System.out.println(inscriptionClub.getIdClub()+"   "+ inscriptionClub.getIdUtilisateur());
		Utilisateur  utilisateur =inscriptionRepository.getByIdUtilisateur(inscriptionClub.getIdUtilisateur());
		if(utilisateur==null) {
			System.err.println("utilisateur non trouver");
			return false;
		}
		
		Club club= clubRepository.findById(inscriptionClub.getIdClub());
		
		if(club==null) {
			System.err.println("club non trouver");
			return false;
		}
		
		utilisateur.getClubs().add(club);
		inscriptionRepository.save(utilisateur);
		
		return true;
		
	}
	

}
