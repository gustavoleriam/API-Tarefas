package com.example.api_tarefas;


import com.example.api_tarefas.service.TarefaService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTarefasApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(ApiTarefasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicação iniciada");


	}
}
