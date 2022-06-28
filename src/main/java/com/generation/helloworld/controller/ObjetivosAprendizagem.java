package com.generation.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosAprendizagem {
	@GetMapping
	public String ObjetivosAprendizagem() {
		return "Spring Boot é o meu objetivo de aprendizagem dessa semana";
	}
}
