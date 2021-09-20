package com.co.edu.unibosque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.co.edu.unibosque.Controller","com.co.edu.unibosque.DAO","com.co.edu.unibosque.Service"})
@EnableJpaRepositories(basePackages = {"com.co.edu.unibosque.DAO.UsuarioRepository1"})
public class Ciclo3Spring11Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Spring11Application.class, args);
	}

}
