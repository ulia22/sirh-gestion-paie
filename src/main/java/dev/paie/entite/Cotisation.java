package dev.paie.entite;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ETY9
 *
 */
@Entity
@Table(name="cotisation")
public class Cotisation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	/** id : Integer */
	private Integer id;
	
	@Column(name="code", length = 25, nullable = true)
	/** code : String */
	private String code;
	
	@Column(name="libelle", length = 255, nullable = true)
	/** libelle : String */
	private String libelle;
	
	@Column(name="tauxSalarial", precision = 5, scale = 2, nullable = true)
	/** tauxSalarial : BigDecimal */
	private BigDecimal tauxSalarial;

	@Column(name="tauxPatronal", precision = 5, scale = 2, nullable = true)
	/** tauxPatronal : BigDecimal */
	private BigDecimal tauxPatronal;
	
	
	/**
	 * 
	 */
	public Cotisation() {
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
