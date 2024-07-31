package fr.cnam.chatnoir76.creaturedecombat.core.rule;

import java.util.ArrayList;
import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;

public abstract class AbstractRuleEngine implements Rule {

	private List<Rule> rules;
	
	public AbstractRuleEngine() {
		rules = new ArrayList<Rule>();
	}
	
	protected void addRule(Rule rule) {
		rules.add(rule);
	}
	
	@Override
	public boolean matches(Jeu jeu) {
		return rules.stream().allMatch(rule -> rule.matches(jeu));
	}

}
