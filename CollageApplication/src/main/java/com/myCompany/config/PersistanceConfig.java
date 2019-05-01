package com.myCompany.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.myCompany.dao","com.myCompany.service"})
public class PersistanceConfig {
	/* getting datasource object */

	@Bean
	public DataSource getDataSource() {

		HikariDataSource ds = null;
		ds = new HikariDataSource();
		ds.setUsername("system");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setPassword("manager");
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return ds;
	}
	@Bean
	public JdbcTemplate getjt() {
		JdbcTemplate jt=new JdbcTemplate(getDataSource());
		return jt;
		
	}
}
