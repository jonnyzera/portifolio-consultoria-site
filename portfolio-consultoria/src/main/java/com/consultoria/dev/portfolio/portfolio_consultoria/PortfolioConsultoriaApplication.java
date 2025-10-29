package com.consultoria.dev.portfolio.portfolio_consultoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
	DataSourceAutoConfiguration.class,
	JpaRepositoriesAutoConfiguration.class
})
public class PortfolioConsultoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioConsultoriaApplication.class, args);
	}

}
