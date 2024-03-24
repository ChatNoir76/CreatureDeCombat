package fr.cnam.chatnoir76.creaturedecombat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
}
