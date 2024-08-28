package fr.cnam.chatnoir76.creaturedecombat.modelcore.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.impl.PiocherRule;

@Configuration
public class RuleService {

	@Bean
	public Rule piocher() {
		return new PiocherRule();
	}
	
}
