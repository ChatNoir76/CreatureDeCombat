package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.service.CarteService;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
@RequestMapping(value = "/cartes")
public class CarteController {
	
	@Autowired
	HateoasService hateoas;
	
	@Autowired
	CarteService carteService;
	
	@GetMapping(value = "")
	public List<CarteDTO> getAllCarte() {
		
		List<CarteDTO> cartes = carteService.getAll();
		cartes.forEach(carte -> {
			if(carte instanceof CarteCreatureDTO) {
				carte.add(hateoas.getSelfLink(
						CreatureController.class, 
						"getCreatureById",
						carte.getId()));
			} else if(carte instanceof CarteEnergieDTO) {
				carte.add(hateoas.getSelfLink(
						EnergieController.class, 
						"getEnergieById",
						carte.getId()));
			} else if(carte instanceof CarteDresseurDTO) {
				carte.add(hateoas.getSelfLink(
						DresseurController.class, 
						"getDresseurById",
						carte.getId()));
			}
			
		});
		return cartes;
	}
	
}
