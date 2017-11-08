/**
 * 
 */
package dev.paie.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import dev.paie.config.ServicesConfig;
import dev.paie.entite.Avantage;

/**
 * @author ETY9
 *
 */
//Sélection des classes de configuration Spring à utiliser lors du test
@ContextConfiguration(classes = { ServicesConfig.class, Avantage.class })
//Configuration JUnit pour que Spring prenne la main sur le cycle de vie du test
@RunWith(SpringRunner.class)
public class AvantageRepositoryTest {

	@Autowired private AvantageRepository avantageRepository;
	
	@Test
	public void test_sauvegarder_lister_mettre_a_jour() {
		// TODO sauvegarder un nouvel avantage
		Avantage a = new Avantage();
		a.setCode("A01");
		a.setMontant(new BigDecimal(3.5));
		a.setNom("Bonus Patron");
		avantageRepository.save(a);
		
		// TODO vérifier qu'il est possible de récupérer le nouvel avantage via la méthode findOne
		Avantage a2 = avantageRepository.findOne(a.getId());
		assertThat(a2.getId()).isEqualTo(a.getId());
		assertThat(a2.getCode()).isEqualTo(a.getCode());
		assertThat(a2.getNom()).isEqualTo(a.getNom());
		assertThat(a2.getMontant().setScale(2)).isEqualTo(a.getMontant().setScale(2));
		
		// TODO modifier un avantage
		a2.setCode("A02");
		avantageRepository.save(a2);
		
		// TODO vérifier que les modifications sont bien prises en compte via la méthode findOne
		Avantage a3 = avantageRepository.findOne(a2.getId());
		assertThat(a3.getCode()).isEqualTo(a2.getCode());
	}
}
