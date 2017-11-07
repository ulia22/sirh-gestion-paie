/**
 * 
 */
package dev.paie.service;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import dev.paie.entite.Cotisation;
import dev.paie.entite.Entreprise;
import dev.paie.entite.Grade;
import dev.paie.entite.Periode;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.EntrepriseRepository;
import dev.paie.repository.GradeRepository;
import dev.paie.repository.PeriodeRepository;
import dev.paie.repository.ProfilRemunerationRepository;

/**
 * @author ETY9
 *
 */
@Service
public class InitialiserDonneesServiceDev implements InitialiserDonneesService {

	@Autowired 
	private CotisationService cotisationService;

	@Autowired 
	private EntrepriseRepository entreprise;

	@Autowired 
	private GradeRepository grade;

	@Autowired 
	private ProfilRemunerationRepository profil;

	@Autowired 
	private PeriodeRepository periode;

	@Override
	public void initialiser() {
		ClassPathXmlApplicationContext context 	= new ClassPathXmlApplicationContext("profils-remuneration.xml",
				"cotisations-imposables.xml", "cotisations-non-imposables.xml","entreprises.xml","grades.xml");

		Map<String, Cotisation> cotisMap = context.getBeansOfType(Cotisation.class);
		cotisMap.forEach((k,v) -> {
			cotisationService.sauvegarder(v);
		});	

		Map<String, Entreprise> entreMap = context.getBeansOfType(Entreprise.class);
		entreMap.forEach((k,v) -> {
			entreprise.save(v);
		});

		Map<String, Grade> gradeMap = context.getBeansOfType(Grade.class);
		gradeMap.forEach((k,v) -> {
			grade.save(v);
		});

		Map<String, ProfilRemuneration> profilMap = context.getBeansOfType(ProfilRemuneration.class);
		profilMap.forEach((k,v) -> {
			profil.save(v);
		});

		periode.save(listerPeriode());

		context.close();

	}
	
	public List<Periode> listerPeriode() {

		List<Periode> list = new ArrayList<>();

		for(int i=0 ; i<12 ; i++) {
			Periode p = new Periode();
			p.setDateDebut(LocalDate.of(LocalDate.now().getYear(), i+1, 1));
			p.setDateFin(p.getDateDebut().with(TemporalAdjusters.lastDayOfMonth()));
			list.add(p);
		}

		return list;
	}

}
