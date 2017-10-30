/**
 * 
 */
package dev.paie.service;

import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.ResultatCalculRemuneration;
import dev.paie.util.PaieUtils;

/**
 * @author ETY9
 *
 */
@Service
public class CalculerRemunerationServiceSimple implements CalculerRemunerationService {
	
	@Autowired
	PaieUtils paieUtils;
	
	/* (non-Javadoc)
	 * @see dev.paie.service.CalculerRemunerationService#calculer(dev.paie.entite.BulletinSalaire)
	 */
	@Override
	public ResultatCalculRemuneration calculer(BulletinSalaire bulletin) {
		ResultatCalculRemuneration res = new ResultatCalculRemuneration();
		
		BigDecimal salaireBase = bulletin.getRemunerationEmploye().getGrade().getNbHeuresBase().multiply(bulletin.getRemunerationEmploye().getGrade().getTauxBase());
		res.setSalaireDeBase(paieUtils.formaterBigDecimal(salaireBase));
		
		BigDecimal salaireBrut = salaireBase.add(bulletin.getPrimeExceptionnelle());
		res.setSalaireBrut(paieUtils.formaterBigDecimal(salaireBrut));
		
		Optional<BigDecimal> totalRevSalarial = bulletin.getRemunerationEmploye()
				.getProfilRemuneration().getCotisationsNonImposables()
				.stream()
				.filter(c->c.getTauxSalarial() != null)
				.map(c->c.getTauxSalarial().multiply(salaireBrut))
				.reduce((c1,c2)->c1.add(c2));
		res.setTotalRetenueSalarial(paieUtils.formaterBigDecimal(totalRevSalarial.get()));

		
		Optional<BigDecimal> totalCotiPatr = bulletin.getRemunerationEmploye()
				.getProfilRemuneration().getCotisationsNonImposables()
				.stream()
				.filter(c->c.getTauxPatronal() != null)
				.map(c->c.getTauxPatronal().multiply(salaireBrut))
				.reduce((c1,c2)->c1.add(c2));
		res.setTotalCotisationsPatronales(paieUtils.formaterBigDecimal(totalCotiPatr.get()));
		
		BigDecimal netImposable = new BigDecimal(res.getSalaireBrut()).subtract(new BigDecimal(res.getTotalRetenueSalarial()));
		res.setNetImposable(paieUtils.formaterBigDecimal(netImposable));
		
		BigDecimal netAPayer = netImposable.subtract(bulletin.getRemunerationEmploye()
				.getProfilRemuneration().getCotisationsImposables()
				.stream()
				.filter(c->c.getTauxSalarial() != null)
				.map(c->c.getTauxSalarial().multiply(salaireBrut))
				.reduce((c1,c2)->c1.add(c2)).get());
		res.setNetAPayer(paieUtils.formaterBigDecimal(netAPayer));
		
		return res;
	}
}
