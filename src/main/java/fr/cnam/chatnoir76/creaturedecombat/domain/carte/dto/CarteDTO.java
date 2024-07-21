package fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto;

public abstract class CarteDTO {

	private static final String imageDos = "__dosCarte.jfif";
	
	private String nom;
	private String description;
	private String image;
	private boolean visible;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static String getImagedos() {
		return imageDos;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
}
