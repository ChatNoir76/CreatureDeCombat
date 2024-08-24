package fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;

public class CarteCreatureDTO extends CarteDTO {

	private int pv;
	private int pvInit;
	private String niveau;
	private String niveauId;
	private String categorie;
	private String categorieId;
	private String nomCreatureBase;
	private String idCreatureBase;
	private List<Integer> attaqueIds;

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
	public String getNiveauId() {
		return niveauId;
	}
	public void setNiveauId(String niveauId) {
		this.niveauId = niveauId;
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
	public String getIdCreatureBase() {
		return idCreatureBase;
	}
	public void setIdCreatureBase(String idCreatureBase) {
		this.idCreatureBase = idCreatureBase;
	}
	public String getCategorieId() {
		return categorieId;
	}
	public void setCategorieId(String categorieId) {
		this.categorieId = categorieId;
	}
	public String getPourcentage() {
		double value = Float.valueOf(pv)/Float.valueOf(pvInit)*100;
		return String.format("%.0f",value) + '%';
	}
	public List<Integer> getAttaqueIds() {
		return attaqueIds;
	}
	public void setAttaqueIds(List<Integer> attaqueIds) {
		this.attaqueIds = attaqueIds;
	}	
}
