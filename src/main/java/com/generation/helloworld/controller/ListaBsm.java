package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/lista-bsm")

public class ListaBsm {
	@GetMapping
	public String ListaBsm() {
		return "Lista Bsm:"
				+ "\nPersistência"
				+ "\nAtenção aos detalhes"
				+ "\nMentalidade de Crescimento"
				+ "\nTrabalho em Equipe"
				+ "\nResponsabilidade Pessoal"
				+ "\nProatividade"
				+ "\nOrientação ao Futuro"
				+ "\nComunicação";
		
	}
}
