package fr.cnam.chatnoir76.creaturedecombat.ui.service;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class HateoasService {
	
	public void linkWithModelAndView(ModelAndView modelAndView, String keyword, RepresentationModel<?> representationModel, Link link) {
		modelAndView.addObject(keyword, link.getHref());
		representationModel.add(link);
	}
	
	public Link getRelLink(Class<?> controller, String methodName, Class<?> parameterType, Object parameter, String linkId) {
		return createWebMvcLinkBuilder(controller, methodName, parameterType, parameter).withRel(linkId);
	}
	
	public Link getRelLink(Class<?> controller, String methodName, String linkId) {
		return createWebMvcLinkBuilder(controller, methodName).withRel(linkId);
	}
	
	public Link getRelLink(Class<?> controller, String methodName, Object parameter, String linkId) {
		return createWebMvcLinkBuilder(controller, methodName, String.class, parameter).withRel(linkId);
	}
	
	public Link getSelfLink(Class<?> controller, String methodName, Object parameter) {
		return createWebMvcLinkBuilder(controller, methodName, String.class, parameter).withSelfRel();
	}
	
	public Link getSelfLink(Class<?> controller, String methodName) {
		return createWebMvcLinkBuilder(controller, methodName).withSelfRel();
	}
	
	public Link getSelfLink(Class<?> controller, String methodName, Class<?> parameterType, Object parameter) {
		return createWebMvcLinkBuilder(controller, methodName, parameterType, parameter).withSelfRel();
	}
	
	private WebMvcLinkBuilder createWebMvcLinkBuilder(Class<?> controller, String methodName, Class<?> parameterType, Object parameter) {
		try {
			return WebMvcLinkBuilder.linkTo(controller.getMethod(methodName, parameterType), parameter);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException("HateoasService shot down");
		}
	}
	
	private WebMvcLinkBuilder createWebMvcLinkBuilder(Class<?> controller, String methodName) {
		try {
			return WebMvcLinkBuilder.linkTo(controller.getMethod(methodName));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException("HateoasService shot down");
		}
	}
	
}
