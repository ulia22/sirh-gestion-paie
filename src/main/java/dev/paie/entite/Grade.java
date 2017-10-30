package dev.paie.entite;

import java.math.BigDecimal;

/**
 * @author ETY9
 *
 */
public class Grade {
	
	/** id : Integer */
	private Integer id;
	/** code : String */
	private String code;
	/** nbHeuresBase : BigDecimal */
	private BigDecimal nbHeuresBase;
	/** tauxBase : BigDecimal */
	private BigDecimal tauxBase;
	
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
	public BigDecimal getNbHeuresBase() {
		return nbHeuresBase;
	}
	/**
	 * @param nbHeuresBase
	 */
	public void setNbHeuresBase(BigDecimal nbHeuresBase) {
		this.nbHeuresBase = nbHeuresBase;
	}
	/**
	 * @return
	 */
	public BigDecimal getTauxBase() {
		return tauxBase;
	}
	/**
	 * @param tauxBase
	 */
	public void setTauxBase(BigDecimal tauxBase) {
		this.tauxBase = tauxBase;
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
