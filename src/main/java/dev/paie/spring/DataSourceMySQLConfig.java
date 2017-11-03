/**
 * 
 */
package dev.paie.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author ETY9
 *
 */
@Configuration
@ComponentScan({"dev.paie.service", "dev.paie.util"})
public class DataSourceMySQLConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://localhost:3306/sirhpaie");
		dataSource.setUsername("sirh-paie");
		dataSource.setPassword("sirh-paie");
		return dataSource;
	}
}
