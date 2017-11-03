package dev.paie.entite;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * @author ETY9
 *
 */
@Entity
@Table(name="grade")
public class Grade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	/** id : Integer */
	private Integer id;
	
	@Column(name="code", length = 25, nullable = false)
	/** code : String */
	private String code;
	
	@Column(name="nbHeuresBase", precision = 5, scale = 2, nullable = true)
	/** nbHeuresBase : BigDecimal */
	private BigDecimal nbHeuresBase;
	
	@Column(name="tauxBase", precision = 5, scale = 2, nullable = true)
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
	
	@Override

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Grade rhs = (Grade) obj;
        return new EqualsBuilder().append(code, rhs.code).isEquals() && new CompareToBuilder()
                .append(nbHeuresBase, rhs.nbHeuresBase).append(tauxBase, rhs.tauxBase).toComparison() == 0;

    }
}
