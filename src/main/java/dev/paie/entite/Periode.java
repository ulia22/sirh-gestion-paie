package dev.paie.entite;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author ETY9
 *
 */
@Entity
@Table(name="periode")
public class Periode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/** id : Integer */
	private Integer id;
	
	@Column(name="dateDebut", nullable = false)
	/** dateDebut : LocalDate */
	private LocalDate dateDebut;
	
	@Column(name="dateFin", nullable = false)
	/** dateFin : LocalDate */
	private LocalDate dateFin;
	
	@OneToMany(mappedBy="periode")
	private List<BulletinSalaire> bulletinsSalaire;
	
	/**
	 * @return
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
	/**
	 * Getter for bulletinsSalaire.
	 * @return the bulletinsSalaire
	 */
	public List<BulletinSalaire> getBulletinsSalaire() {
		return bulletinsSalaire;
	}
	/**
	 * Setter for bulletinsSalaire
	 * @param bulletinsSalaire the bulletinsSalaire to set
	 */
	public void setBulletinsSalaire(List<BulletinSalaire> bulletinsSalaire) {
		this.bulletinsSalaire = bulletinsSalaire;
	}	
	
	public String getRange(){
		return dateDebut.toString()+" - "+dateFin.toString();
	}
}
