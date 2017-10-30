package dev.paie.entite;

/**
 * @author ETY9
 *
 */
public class Entreprise {

	/** id : Integer */
	private Integer id;
	/** siret : String */
	private String siret;
	/** denomination : String */
	private String denomination;
	/** adresse : String */
	private String adresse;
	/** urssaf : String */
	private String urssaf;
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
