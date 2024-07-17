package fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto;

public class CarteDTO {

	private String image;
	private String dosCarte;
	private boolean visible;
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

	public String getDosCarte() {
		return dosCarte;
	}

	public void setDosCarte(String dosCarte) {
		this.dosCarte = dosCarte;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
}
