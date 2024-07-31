package fr.cnam.chatnoir76.creaturedecombat.ui.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.cnam.chatnoir76.creaturedecombat.domain.jeu.dto.JeuDTO;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@JsonIgnoreProperties({"targetSource", "advisors", "beanFactory", "beanExpressionResolver"})
public class SalleBeanSession {
	
	private JeuDTO jeu1;
	
	private JeuDTO jeu2;

	public JeuDTO getJeu1() {
		return jeu1;
	}

	public void setJeu1(JeuDTO jeu1) {
		this.jeu1 = jeu1;
	}

	public JeuDTO getJeu2() {
		return jeu2;
	}

	public void setJeu2(JeuDTO jeu2) {
		this.jeu2 = jeu2;
	}
	
	
}
