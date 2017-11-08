/**
 * 
 */
package dev.paie.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import dev.paie.config.ServicesConfig;
import dev.paie.entite.Cotisation;

/**
 * @author ETY9
 *
 */
//Sélection des classes de configuration Spring à utiliser lors du test
@ContextConfiguration(classes = { ServicesConfig.class})
//Configuration JUnit pour que Spring prenne la main sur le cycle de vie du test
@RunWith(SpringRunner.class)
public class CotisationServiceJpaTest {

	@Autowired
	private CotisationService cotisationService;

	@Test
	public void test_sauvegarder_lister_mettre_a_jour() {
		// TODO sauvegarder une nouvelle cotisation
		Cotisation c = new Cotisation();
		c.setCode("M01");
		c.setLibelle("Bonjour");
		c.setTauxPatronal(new BigDecimal("10.50"));
		c.setTauxSalarial(new BigDecimal("0.50"));
		cotisationService.sauvegarder(c);

		
		// TODO vérifier qu'il est possible de récupérer la nouvelle cotisation via la méthode lister
		cotisationService.lister().stream().forEach(c1->System.out.println(c1.getId()+" "+c1.getCode()+" "+c1.getLibelle()));
		assertThat(cotisationService.lister().get(0).getCode()).isEqualTo("M01");

		// TODO modifier une cotisation
		Cotisation c2 = cotisationService.lister().get(0);
		c2.setLibelle("Bouuuuh");
		c2.setCode("M02");
		cotisationService.mettreAJour(c2);
		
		// TODO vérifier que les modifications sont bien prises en compte via la méthode lister
		cotisationService.lister().stream().forEach(c1->System.out.println(c1.getId()+" "+c1.getCode()+" "+c1.getLibelle()));
		assertThat(c2.getCode()).isEqualTo("M02");
	}
}
