/**
 * 
 */
package dev.paie.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dev.paie.entite.Cotisation;

/**
 * @author ETY9
 *
 */
@Service
public class CotisationServiceJpa implements CotisationService{
	@PersistenceContext private EntityManager em;

	/* (non-Javadoc)
	 * @see dev.paie.service.CotisationService#sauvegarder(dev.paie.entite.Cotisation)
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED, timeout=60)
	public void sauvegarder(Cotisation nouvelleCotisation) {
		em.persist(nouvelleCotisation);
	}

	/* (non-Javadoc)
	 * @see dev.paie.service.CotisationService#mettreAJour(dev.paie.entite.Cotisation)
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED, timeout=60)
	public void mettreAJour(Cotisation cotisation) {
		Cotisation c = em.find(Cotisation.class, cotisation.getId());
		c.setCode(cotisation.getCode());
		c.setLibelle(cotisation.getLibelle());
		c.setTauxPatronal(cotisation.getTauxPatronal());
		c.setTauxSalarial(cotisation.getTauxSalarial());
	}

	/* (non-Javadoc)
	 * @see dev.paie.service.CotisationService#lister()
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED, timeout=60)
	public List<Cotisation> lister() {
			TypedQuery<Cotisation> q = em.createQuery("FROM Cotisation c", Cotisation.class);
			List<Cotisation> l = q.getResultList();
			
		return l;
	}
}
