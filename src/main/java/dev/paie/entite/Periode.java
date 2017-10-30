package dev.paie.entite;

import java.time.LocalDate;


/**
 * @author ETY9
 *
 */
public class Periode {
	
	/** id : Integer */
	private Integer id;
	/** dateDebut : LocalDate */
	private LocalDate dateDebut;
	/** dateFin : LocalDate */
	private LocalDate dateFin;
	
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
}
