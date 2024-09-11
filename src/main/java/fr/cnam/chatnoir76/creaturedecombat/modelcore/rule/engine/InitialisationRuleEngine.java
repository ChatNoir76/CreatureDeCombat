package fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.AbstractRuleEngine;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.RuleService;
import jakarta.annotation.PostConstruct;

@Component
public class InitialisationRuleEngine extends AbstractRuleEngine {

	@Autowired 
	RuleService ruleService;
	
	@PostConstruct
	public void initialization() {
		this.addRule(ruleService.estPretAJouer());
	}
	
	
}
