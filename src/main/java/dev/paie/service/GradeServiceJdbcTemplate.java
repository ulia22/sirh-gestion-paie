/**
 * 
 */
package dev.paie.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import dev.paie.entite.Grade;
import dev.paie.util.GradeMapper;

/**
 * @author ETY9
 *
 */
@Service
public class GradeServiceJdbcTemplate implements GradeService {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public GradeServiceJdbcTemplate(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/* (non-Javadoc)
	 * @see dev.paie.service.GradeService#sauvegarder(dev.paie.entite.Grade)
	 */
	@Override
	public void sauvegarder(Grade g) {
		String sql = "INSERT INTO `grade`(`code`, `nbHeuresBase`, `tauxBase`) VALUES (?,?,?)";
		this.jdbcTemplate.update(sql, g.getCode(), g.getNbHeuresBase().toPlainString(), g.getTauxBase().toPlainString());
	}

	/* (non-Javadoc)
	 * @see dev.paie.service.GradeService#mettreAJour(dev.paie.entite.Grade)
	 */
	@Override
	public void mettreAJour(Grade g) {
		String sql = "UPDATE `grade` SET `code`=?,`nbHeuresBase`=?,`tauxBase`=? WHERE id=?";
		this.jdbcTemplate.update(sql, g.getCode(), g.getNbHeuresBase().toPlainString(), g.getTauxBase().toPlainString(), g.getId());
	}

	/* (non-Javadoc)
	 * @see dev.paie.service.GradeService#lister()
	 */
	@Override
	public List<Grade> lister() {
		String sql = "SELECT * FROM `grade` WHERE 1";	
		return this.jdbcTemplate.query(sql, new GradeMapper());
	}

}
