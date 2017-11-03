/**
 * 
 */
package dev.paie.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.management.GarbageCollectorMXBean;
import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import dev.paie.entite.Grade;
import dev.paie.spring.DataSourceMySQLConfig;

/**
 * @author ETY9
 *
 */
//Sélection des classes de configuration Spring à utiliser lors du test
@ContextConfiguration(classes = { DataSourceMySQLConfig.class})
//Configuration JUnit pour que Spring prenne la main sur le cycle de vie du test
@RunWith(SpringRunner.class)
public class GradeServiceJdbcTemplateTest {

	@Autowired 
	private GradeService gradeService;

	@Test
	public void test_sauvegarder_lister_mettre_a_jour() {
		// TODO sauvegarder un nouveau grade
		Grade g= new Grade();
		g.setCode("M01");
		g.setNbHeuresBase(new BigDecimal("7.2"));
		g.setTauxBase(new BigDecimal("0.3"));
		gradeService.sauvegarder(g);
		
		// TODO vérifier qu'il est possible de récupérer le nouveau grade via la méthode lister
		Grade g2= new Grade();
		g2.setCode("M01");
		g2.setNbHeuresBase(new BigDecimal("7.2"));
		g2.setTauxBase(new BigDecimal("0.3"));
		
		List<Grade> gl = gradeService.lister();
		assertThat(gl.size() == 1).isTrue();
		assertThat(gl.get(0).equals(g2)).isTrue();
		
		// TODO modifier un grade
		gl.get(0).setCode("M02");
		gradeService.mettreAJour((Grade)gl.get(0));
		List<Grade> gl2 = gradeService.lister();
		
		assertThat(gl2.size() == 1).isTrue();
		assertThat(gl2.get(0).getCode().equals("M02")).isTrue();
		
		// TODO vérifier que les modifications sont bien prises en compte via la méthode lister
		 gradeService.lister()
		 .stream()
		 .forEach(gr -> System.out.println(gr.toString()));
	}
}
