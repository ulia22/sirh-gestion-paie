package dev.paie.entite;

import java.util.List;


/**
 * @author ETY9
 *
 */
public class ProfilRemuneration {

	/** id : Integer */
	private Integer id;
	/** code : String */
	private String code;

	/** cotisationsNonImposables : List<Cotisation> */
	private List<Cotisation> cotisationsNonImposables;
	
	/** cotisationsImposables : List<Cotisation> */
	private List<Cotisation> cotisationsImposables;
	
	/** avantages : List<Avantage> */
	private List<Avantage> avantages;

	/**
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return
	 */
	public List<Cotisation> getCotisationsNonImposables() {
		return cotisationsNonImposables;
	}

	/**
	 * @param cotisationsNonImposables
	 */
	public void setCotisationsNonImposables(List<Cotisation> cotisationsNonImposables) {
		this.cotisationsNonImposables = cotisationsNonImposables;
	}

	/**
	 * @return
	 */
	public List<Cotisation> getCotisationsImposables() {
		return cotisationsImposables;
	}

	/**
	 * @param cotisationsImposables
	 */
	public void setCotisationsImposables(List<Cotisation> cotisationsImposables) {
		this.cotisationsImposables = cotisationsImposables;
	}

	/**
	 * @return
	 */
	public List<Avantage> getAvantages() {
		return avantages;
	}

	/**
	 * @param avantages
	 */
	public void setAvantages(List<Avantage> avantages) {
		this.avantages = avantages;
	}
}
