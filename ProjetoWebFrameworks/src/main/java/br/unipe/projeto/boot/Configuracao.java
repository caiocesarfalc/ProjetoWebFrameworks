package br.unipe.projeto.boot;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"br.unipe.projeto.java.jpa.model"})
@EnableJpaRepositories(basePackages = {"br.unipe.projeto.java.jpa.dao.data"})
@ComponentScan(basePackages = {"br.unipe.projeto.javaweb.controller"})
public class Configuracao extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Configuracao.class);
	}

	
}
