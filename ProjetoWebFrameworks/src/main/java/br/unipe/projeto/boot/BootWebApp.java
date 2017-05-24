package br.unipe.projeto.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootWebApp {
	
	public static void main(String[] args) {
		Class[] lista = {BootWebApp.class, Configuracao.class};
		SpringApplication.run(lista, args);
	}

}
