package fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;

public class CarteCreatureDTO extends CarteDTO {

	private int pv;
	private int pvInit;
	private String niveau;
	private String categorie;
	private String nomCreatureBase;
//	private List<AttaqueDTO> attaques;
//	
//	public CarteCreatureDTO() {
//		attaques = new ArrayList<AttaqueDTO>();
//	}
//	
//	public List<AttaqueDTO> getAttaques() {
//		return attaques;
//	}
//	public void setAttaques(List<AttaqueDTO> attaques) {
//		this.attaques = attaques;
//	}
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	public int getPvInit() {
		return pvInit;
	}
	public void setPvInit(int pvInit) {
		this.pvInit = pvInit;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getNomCreatureBase() {
		return nomCreatureBase;
	}
	public void setNomCreatureBase(String nomCreatureBase) {
		this.nomCreatureBase = nomCreatureBase;
	}
	public String getPourcentage() {
		double value = Float.valueOf(pv)/Float.valueOf(pvInit)*100;
		return String.format("%.0f",value) + '%';
	}
	
}
