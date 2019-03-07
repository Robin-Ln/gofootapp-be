package fr.m2till.gofootapp.controleur;

import fr.m2till.gofootapp.dto.ClubDto;
import fr.m2till.gofootapp.dto.EquipeDto;
import fr.m2till.gofootapp.dto.InscriptionClubDto;
import fr.m2till.gofootapp.dto.NouveauClubDto;
import fr.m2till.gofootapp.entity.Club;
import fr.m2till.gofootapp.entity.Equipe;
import fr.m2till.gofootapp.entity.Utilisateur;
import fr.m2till.gofootapp.repository.ClubRepository;
import fr.m2till.gofootapp.repository.InscriptionRepository;
import fr.m2till.gofootapp.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class ClubControleur {

	@Autowired
	private ClubRepository clubRepository;

	@Autowired
	private InscriptionRepository inscriptionRepository;

	@Autowired
	private EquipeRepository EquipeRepository;

	@RequestMapping(value = "/be/clubNonAdherer", method = RequestMethod.POST)
	@ResponseBody
	public List<ClubDto> getListeClubNonAdherer(@RequestBody Integer idUtilisateur) {
		Iterable<Club> clubs = clubRepository.findAll();
		List<ClubDto> listeClub = new ArrayList<>();
		Iterator<Club> it = clubs.iterator();
		while (it.hasNext()) {
			Club club = it.next();
			boolean adherent = false;
			for (int x = 0; x < club.getUtilisateurs().size(); x++) {
				Utilisateur utilisateur = club.getUtilisateurs().get(x);
				if (utilisateur.getIdUtilisateur() == idUtilisateur) {
					adherent = true;
				}
			}
			if (!adherent) {
				listeClub.add(new ClubDto(club.getId(), club.getNom(), club.getUtilisateurs().size(), null));
			}
		}
		return listeClub;
	}

	@RequestMapping(value = "/be/clubAdherer", method = RequestMethod.POST)
	@ResponseBody
	public List<ClubDto> getListeClubAdherer(@RequestBody Integer idUtilisateur) {
		Iterable<Club> clubs = clubRepository.findAll();
		List<ClubDto> listeClub = new ArrayList<>();
		Iterator<Club> it = clubs.iterator();
		while (it.hasNext()) {
			Club club = it.next();
			boolean adherent = false;
			for (int x = 0; x < club.getUtilisateurs().size(); x++) {
				Utilisateur utilisateur = club.getUtilisateurs().get(x);
				if (utilisateur.getIdUtilisateur() == idUtilisateur) {
					adherent = true;
				}
			}
			if (adherent) {
				EquipeDto[] listeEquipesFinal = null;
				List<Equipe> listeEquipes = this.EquipeRepository.findByClub(club);
				if (listeEquipes != null && listeEquipes.size() > 0) {
					listeEquipesFinal = new EquipeDto[listeEquipes.size()];
					for (int i = 0; i < listeEquipes.size(); i++) {
						Equipe equipe = listeEquipes.get(i);
						listeEquipesFinal[i] = new EquipeDto();
						if(equipe.getAssEquipeUtilisateurs()==null) {
							listeEquipesFinal[i].setNombreUtilisateur(0);
						}else {
							listeEquipesFinal[i].setNombreUtilisateur(equipe.getAssEquipeUtilisateurs().size());
						}
						
						listeEquipesFinal[i].setCategorie(equipe.getCategorie().getLibelle());
						listeEquipesFinal[i].setNom(equipe.getNom());

					}
				}
				listeClub.add(new ClubDto(club.getId(), club.getNom(), club.getUtilisateurs().size(), listeEquipesFinal));
			}
		}
		System.out.println("Club :" + listeClub.size());
		return listeClub;
	}

	@RequestMapping(value = "/be/rejoindreClub", method = RequestMethod.POST)
	@ResponseBody
	public boolean rejoindreClub(@RequestBody InscriptionClubDto inscriptionClub) {
		System.out.println(inscriptionClub.getIdClub() + "   " + inscriptionClub.getIdUtilisateur());
		Utilisateur utilisateur = inscriptionRepository.getByIdUtilisateur(inscriptionClub.getIdUtilisateur());
		if (utilisateur == null) {
			System.err.println("utilisateur non trouver");
			return false;
		}

		Club club = clubRepository.findById(inscriptionClub.getIdClub());

		if (club == null) {
			System.err.println("club non trouver");
			return false;
		}

		utilisateur.getClubs().add(club);
		inscriptionRepository.save(utilisateur);

		return true;

	}

	@RequestMapping(value = "/be/nouveauClub", method = RequestMethod.POST)
	@ResponseBody
	public boolean nouveauClub(@RequestBody NouveauClubDto nouveauClub) {
		Utilisateur utilisateur = inscriptionRepository.getByIdUtilisateur(nouveauClub.getIdUtilisateur());
		if (utilisateur == null) {
			System.err.println("utilisateur non trouver");
			return false;
		}

		Club club = new Club();
		club.setNom(nouveauClub.getNom());
		Club clubCreer = clubRepository.save(club);

		utilisateur.getClubs().add(clubCreer);
		inscriptionRepository.save(utilisateur);

		return true;

	}

}
