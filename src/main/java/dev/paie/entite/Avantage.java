package dev.paie.entite;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avantage")
public class Avantage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	/** id : Integer */
	private Integer id;
	
	@Column(name="code", length=25, nullable=true)
	/** code : String */
	private String code;
	
	@Column(name="nom", length=255, nullable=true)
	/** nom : String */
	private String nom;
	
	@Column(name="montant", precision=5, scale=2, nullable=true)
	/** montant : BigDecimal */
	private BigDecimal montant;

	
	/**
	 * 
	 */
	public Avantage() {
		super();
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
