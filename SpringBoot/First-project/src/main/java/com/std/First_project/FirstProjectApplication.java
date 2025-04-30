package com.std.First_project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;
import com.std.First_project.app.ConversorJson;
import com.std.First_project.app.ViaCepResponse;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ConversorJson conversorJson) throws Exception{
		return args ->{
			String json = "{\"cep\":\"01001-000\", \"logradouro\": \"praca da sé\", \"localidade\": \"fe\"}";
			ViaCepResponse response = conversorJson.converter(json);
			System.out.println("Dados do cep: "+ response);
		};
	}

	//tranformei em uma dependencia ijetavel
	// coloquei em outro arquivo para nao poluir
	// @Bean 
	// public Gson gson(){
	// 	return new Gson();
	// }

}
