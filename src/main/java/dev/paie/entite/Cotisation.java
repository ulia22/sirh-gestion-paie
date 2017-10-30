package dev.paie.entite;

import java.math.BigDecimal;

/**
 * @author ETY9
 *
 */
public class Cotisation {
	
	/** id : Integer */
	private Integer id;
	/** code : String */
	private String code;
	/** libelle : String */
	private String libelle;
	/** tauxSalarial : BigDecimal */
	private BigDecimal tauxSalarial;
	/** tauxPatronal : BigDecimal */
	private BigDecimal tauxPatronal;
	
	
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
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return
	 */
	public BigDecimal getTauxSalarial() {
		return tauxSalarial;
	}
	/**
	 * @param tauxSalarial
	 */
	public void setTauxSalarial(BigDecimal tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}
	/**
	 * @return
	 */
	public BigDecimal getTauxPatronal() {
		return tauxPatronal;
	}
	/**
	 * @param tauxPatronal
	 */
	public void setTauxPatronal(BigDecimal tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}
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
	
	
	
	

}
