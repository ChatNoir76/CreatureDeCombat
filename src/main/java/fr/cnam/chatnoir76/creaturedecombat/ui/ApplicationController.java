package fr.cnam.chatnoir76.creaturedecombat.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
public class ApplicationController {
	
	@Autowired
	HateoasService hateoas;
	
	@GetMapping("/")
	public ModelAndView index() {
		CreatureDeCombat cdc = new CreatureDeCombat();
		ModelAndView mv = new ModelAndView("index", "root", cdc);
		hateoas.linkWithModelAndView(mv, "self", cdc, hateoas.getSelfLink(ApplicationController.class,"index"));
		hateoas.linkWithModelAndView(mv, "creatures", cdc, hateoas.getRelLink(CreatureController.class,"getAllCreature","creatures"));
		hateoas.linkWithModelAndView(mv, "attaques", cdc, hateoas.getRelLink(AttaqueController.class,"getAllAttaque","attaques"));
		hateoas.linkWithModelAndView(mv, "degats", cdc, hateoas.getRelLink(DegatController.class,"getAllDegat","degats"));
		return mv;
	}
	
}

class CreatureDeCombat extends RepresentationModel<CreatureDeCombat> {
	
}