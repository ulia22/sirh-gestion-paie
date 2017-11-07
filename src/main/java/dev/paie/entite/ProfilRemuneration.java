package dev.paie.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

/**
 * @author ETY9
 *
 */
@Entity
@Table(name="profilRemuneration")
public class ProfilRemuneration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/** id : Integer */
	private Integer id;
	
	@Column(name="code", length = 25, nullable = false)
	/** code : String */
	private String code;

	
	@ManyToMany
	@JoinTable(name="pro_cot_nimp",
	joinColumns=
		@JoinColumn(name="ID_pro", referencedColumnName="ID"),
		inverseJoinColumns=
		@JoinColumn(name="ID_cot", referencedColumnName="ID")
		)
	/** cotisationsNonImposables : List<Cotisation> */
	private List<Cotisation> cotisationsNonImposables;
	
	@ManyToMany
	@JoinTable(name="pro_cot_imp",
	joinColumns=
		@JoinColumn(name="ID_pro", referencedColumnName="ID"),
		inverseJoinColumns=
		@JoinColumn(name="ID_cot", referencedColumnName="ID")
		)
	/** cotisationsImposables : List<Cotisation> */
	private List<Cotisation> cotisationsImposables;
	
	@OneToMany
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
