package dev.paie.entite;

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
@Table(name="entreprise")
public class Entreprise {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	/** id : Integer */
	private Integer id;
	
	@Column(name="siret", length=50, nullable=false)
	/** siret : String */
	private String siret;
	
	@Column(name="denomination", length=50, nullable=true)
	/** denomination : String */
	private String denomination;
	
	@Column(name="adresse", length=255, nullable=true)
	/** adresse : String */
	private String adresse;
	
	@Column(name="urssaf", length=50, nullable=false)
	/** urssaf : String */
	private String urssaf;
	
	@Column(name="codeNaf", length=50, nullable=true)
	/** codeNaf : String */
	private String codeNaf;
	
	/**
	 * @return
	 */
	public String getDenomination() {
		return denomination;
	}
	/**
	 * @param denomination
	 */
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	/**
	 * @return
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return
	 */
	public String getSiret() {
		return siret;
	}
	/**
	 * @param siret
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}
	/**
	 * @return
	 */
	public String getUrssaf() {
		return urssaf;
	}
	/**
	 * @param urssaf
	 */
	public void setUrssaf(String urssaf) {
		this.urssaf = urssaf;
	}
	/**
	 * @return
	 */
	public String getCodeNaf() {
		return codeNaf;
	}
	/**
	 * @param codeNaf
	 */
	public void setCodeNaf(String codeNaf) {
		this.codeNaf = codeNaf;
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
