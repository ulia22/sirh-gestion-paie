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
/**
 * @author ETY9
 *
 */
@Entity
@Table(name="remunerationEmploye")
public class RemunerationEmploye {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	/** id : Integer */
	private Integer id;
	
	@Column(name="matricule", length = 50, nullable = false)
	/** matricule : String */
	private String matricule;
	
	
	/** entreprise : Entreprise */
	private Entreprise entreprise;
	/** profilRemuneration : ProfilRemuneration */
	private ProfilRemuneration profilRemuneration;
	/** grade : Grade */
	private Grade grade;
	
	/**
	 * @return
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	/**
	 * @return
	 */
	public Entreprise getEntreprise() {
		return entreprise;
	}
	/**
	 * @param entreprise
	 */
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	/**
	 * @return
	 */
	public ProfilRemuneration getProfilRemuneration() {
		return profilRemuneration;
	}
	/**
	 * @param profilRemuneration
	 */
	public void setProfilRemuneration(ProfilRemuneration profilRemuneration) {
		this.profilRemuneration = profilRemuneration;
	}
	/**
	 * @return
	 */
	public Grade getGrade() {
		return grade;
	}
	/**
	 * @param grade
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
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
