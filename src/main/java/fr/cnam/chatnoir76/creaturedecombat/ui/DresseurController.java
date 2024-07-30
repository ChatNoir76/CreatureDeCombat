package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.service.DresseurService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
@RequestMapping(value = "/dresseurs")
public class DresseurController {

	@Autowired
	HateoasService hateoas;
	
	@Autowired
	DresseurService dresseurService;
	
	@GetMapping(value = "")
	public List<CarteDresseurDTO> getAllCreature() {
		List<CarteDresseurDTO> dresseurs = dresseurService.getAll();
		return dresseurs;
	}
	
	@GetMapping(value = "/{dresseurId}")
	public CarteDresseurDTO getDresseurById(@PathVariable("dresseurId") String dresseurId) {
		CarteDresseurDTO dresseur = dresseurService.getById(dresseurId);
		return dresseur;
	}
	
}
