/**
 * 
 */
package dev.paie.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ETY9
 *
 */
@Entity
@Table(name="resultatCalculRemuneration")
public class ResultatCalculRemuneration {
	
	@Column(name="salaireDeBase", length = 50, nullable = false)
	private String salaireDeBase;
	
	
	@Column(name="salaireBrut", length = 50, nullable = false)
	private String salaireBrut;
	
	
	@Column(name="totalRetenueSalarial", length = 50, nullable = false)
	private String totalRetenueSalarial;
	
	
	@Column(name="totalCotisationsPatronales", length = 50, nullable = false)
	private String totalCotisationsPatronales;
	
	
	@Column(name="netImposable", length = 50, nullable = false)
	private String netImposable;
	
	
	@Column(name="netAPayer", length = 50, nullable = false)
	private String netAPayer;
	
	
	/**
	 * Getter for salaireDeBase.
	 * @return the salaireDeBase
	 */
	public String getSalaireDeBase() {
		return salaireDeBase;
	}
	/**
	 * Setter for salaireDeBase
	 * @param salaireDeBase the salaireDeBase to set
	 */
	public void setSalaireDeBase(String salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}
	/**
	 * Getter for salaireBrut.
	 * @return the salaireBrut
	 */
	public String getSalaireBrut() {
		return salaireBrut;
	}
	/**
	 * Setter for salaireBrut
	 * @param salaireBrut the salaireBrut to set
	 */
	public void setSalaireBrut(String salaireBrut) {
		this.salaireBrut = salaireBrut;
	}
	/**
	 * Getter for totalRetenueSalarial.
	 * @return the totalRetenueSalarial
	 */
	public String getTotalRetenueSalarial() {
		return totalRetenueSalarial;
	}
	/**
	 * Setter for totalRetenueSalarial
	 * @param totalRetenueSalarial the totalRetenueSalarial to set
	 */
	public void setTotalRetenueSalarial(String totalRetenueSalarial) {
		this.totalRetenueSalarial = totalRetenueSalarial;
	}
	/**
	 * Getter for totalCotisationsPatronales.
	 * @return the totalCotisationsPatronales
	 */
	public String getTotalCotisationsPatronales() {
		return totalCotisationsPatronales;
	}
	/**
	 * Setter for totalCotisationsPatronales
	 * @param totalCotisationsPatronales the totalCotisationsPatronales to set
	 */
	public void setTotalCotisationsPatronales(String totalCotisationsPatronales) {
		this.totalCotisationsPatronales = totalCotisationsPatronales;
	}
	/**
	 * Getter for netImposable.
	 * @return the netImposable
	 */
	public String getNetImposable() {
		return netImposable;
	}
	/**
	 * Setter for netImposable
	 * @param netImposable the netImposable to set
	 */
	public void setNetImposable(String netImposable) {
		this.netImposable = netImposable;
	}
	/**
	 * Getter for netAPayer.
	 * @return the netAPayer
	 */
	public String getNetAPayer() {
		return netAPayer;
	}
	/**
	 * Setter for netAPayer
	 * @param netAPayer the netAPayer to set
	 */
	public void setNetAPayer(String netAPayer) {
		this.netAPayer = netAPayer;
	}
	
}
