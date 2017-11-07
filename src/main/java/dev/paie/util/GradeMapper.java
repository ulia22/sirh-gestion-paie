/**
 * 
 */
package dev.paie.util;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import dev.paie.entite.Grade;

/**
 * @author ETY9
 *
 */
@Service
public class GradeMapper implements RowMapper<Grade>{
	
	@Override
	public Grade mapRow(ResultSet res, int numRow) throws SQLException {
		Grade g = new Grade();
		g.setId(res.getInt("id"));
		g.setCode(res.getString("code"));
		g.setNbHeuresBase(res.getBigDecimal("nbHeuresBase"));
		g.setTauxBase(res.getBigDecimal("tauxBase"));
		return g;
	}
}
