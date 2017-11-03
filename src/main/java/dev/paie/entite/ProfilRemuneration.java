package dev.paie.entite;

import java.util.List;

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
@Table(name="profilRemuneration")
public class ProfilRemuneration {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	/** id : Integer */
	private Integer id;
	
	@Column(name="code", length = 25, nullable = false)
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
