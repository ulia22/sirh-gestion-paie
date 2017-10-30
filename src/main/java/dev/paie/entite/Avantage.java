package dev.paie.entite;

import java.math.BigDecimal;

public class Avantage {

	/** id : Integer */
	private Integer id;
	/** code : String */
	private String code;
	/** nom : String */
	private String nom;
	/** montant : BigDecimal */
	private BigDecimal montant;

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
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return
	 */
	public BigDecimal getMontant() {
		return montant;
	}

	/**
	 * @param montant
	 */
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
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
