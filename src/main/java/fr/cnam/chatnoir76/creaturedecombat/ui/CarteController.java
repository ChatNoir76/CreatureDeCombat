package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		cartes.forEach(carte -> carte.add(getLink(carte)));
		return cartes;
	}
	
	@GetMapping(value = "/{carteId}")
	public CarteDTO getCarteById(@PathVariable("carteId") String carteId) {
		CarteDTO carte = carteService.getById(carteId);
		carte.add(getLink(carte));
		return carte;
	}
	
	private Link getLink(CarteDTO carte) {
		if(carte instanceof CarteCreatureDTO) {
			return hateoas.getSelfLink(
					CreatureController.class, 
					"getCreatureById",
					carte.getId());
		} else if(carte instanceof CarteEnergieDTO) {
			return hateoas.getSelfLink(
					EnergieController.class, 
					"getEnergieById",
					carte.getId());
		} else if(carte instanceof CarteDresseurDTO) {
			return hateoas.getSelfLink(
					DresseurController.class, 
					"getDresseurById",
					carte.getId());
		} else {
			return null;
		}
	}
	
}
