/**
 * 
 */
package dev.paie.web.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dev.paie.entite.Entreprise;
import dev.paie.entite.Grade;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.entite.RemunerationEmploye;
import dev.paie.repository.EntrepriseRepository;
import dev.paie.repository.GradeRepository;
import dev.paie.repository.ProfilRemunerationRepository;
import dev.paie.repository.RemunerationEmployeRepository;

/**
 * @author ETY9
 *
 */
@Controller
@RequestMapping("/employes")
public class EmployeController {

	@Autowired private EntrepriseRepository repoEntr;
	@Autowired private ProfilRemunerationRepository repoProf;
	@Autowired private GradeRepository repoGrad;
	@Autowired private RemunerationEmployeRepository repoRemu;
	
	@RequestMapping(value="/creer", method = RequestMethod.GET)
	@Secured("ROLE_ADMINISTRATEUR")
	public ModelAndView creer(){
		List<Entreprise> listEntr = repoEntr.findAll();
		List<ProfilRemuneration> listProf = repoProf.findAll();
		List<Grade> listGrad = repoGrad.findAll();
		
		RemunerationEmploye rem = new RemunerationEmploye();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employes/creerEmploye");
		mv.addObject("listEntr", listEntr);
		mv.addObject("listProf", listProf);
		mv.addObject("listGrad", listGrad);
		mv.addObject("rem", rem);
		
		return mv;
	}
	
	@RequestMapping(value="/creer", method = RequestMethod.POST)
	@Secured("ROLE_ADMINISTRATEUR")
	public String formSubmit(@RequestParam("matricule") String matricule, 
			@RequestParam("entreprise") String entreprise,
			@RequestParam("profilRemuneration") String profil,
			@RequestParam("grade") String grade){
		RemunerationEmploye rem = new RemunerationEmploye();
		rem.setMatricule(matricule);
		rem.setEntreprise(repoEntr.findOne(Integer.parseInt(entreprise)));
		rem.setGrade(repoGrad.findOne(Integer.parseInt(grade)));
		rem.setProfilRemuneration(repoProf.findOne(Integer.parseInt(profil)));
		rem.setDateHeureCreation(LocalDateTime.now());
		
		repoRemu.save(rem);
		
		
		
		return "redirect:/mvc/employes/lister";
	}
	@RequestMapping(value="/lister", method = RequestMethod.GET)
	@Secured({"ROLE_ADMINISTRATEUR", "ROLE_UTILISATEUR"})
	public ModelAndView lister(){
		
		ModelAndView mav = new ModelAndView();
		List<RemunerationEmploye> listRem = repoRemu.findAll();
		mav.setViewName("employes/listerEmployes");
		mav.addObject("listRem", listRem);
		
		return mav;
	}

}
