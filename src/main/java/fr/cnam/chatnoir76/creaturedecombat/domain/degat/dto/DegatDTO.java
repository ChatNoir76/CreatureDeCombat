package fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto;

public class DegatDTO {
	
	private int degat;
	private String type;
	private String mode;
	private int precision;
	private int rattage;
	
	public int getDegat() {
		return degat;
	}
	public void setDegat(int degat) {
		this.degat = degat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	public int getRattage() {
		return rattage;
	}
	public void setRattage(int rattage) {
		this.rattage = rattage;
	}
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(type.equals("Attaque") ? "-" : "+");
		s.append(degat);
		s.append(mode.equals("Base") ? "pv" : "%");
		return s.toString();
	}
	
	
}
