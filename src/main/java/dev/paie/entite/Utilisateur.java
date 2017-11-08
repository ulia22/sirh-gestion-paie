/**
 * 
 */
package dev.paie.entite;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ETY9
 *
 */
@Entity
@Table(name="utilisateur")
public class Utilisateur {

	public enum ROLES{
		ROLE_ADMINISTRATEUR, ROLE_UTILISATEUR
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nomUtilisateur;
	@Column
	private String motDePasse;
	@Column
	private Boolean estActif;
	@Column
	@Enumerated(EnumType.STRING)
	private ROLES role;
	/**
	 * Getter for id.
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Setter for id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Getter for nomUtilisateur.
	 * @return the nomUtilisateur
	 */
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	/**
	 * Setter for nomUtilisateur
	 * @param nomUtilisateur the nomUtilisateur to set
	 */
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	/**
	 * Getter for motDePasse.
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}
	/**
	 * Setter for motDePasse
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	/**
	 * Getter for estActif.
	 * @return the estActif
	 */
	public Boolean getEstActif() {
		return estActif;
	}
	/**
	 * Setter for estActif
	 * @param estActif the estActif to set
	 */
	public void setEstActif(Boolean estActif) {
		this.estActif = estActif;
	}
	/**
	 * Getter for role.
	 * @return the role
	 */
	public ROLES getRole() {
		return role;
	}
	/**
	 * Setter for role
	 * @param role the role to set
	 */
	public void setRole(ROLES role) {
		this.role = role;
	}
	
	
}
