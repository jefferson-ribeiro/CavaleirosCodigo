package br.com.example.cavcod.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

//import para indicar que tratasse do controlador principal
@RestController
//Classe inicial da aplicação 
public class HomeController {

	// rota inicial
	@GetMapping("/")
	public String index() {
		return "Projeto Final - Cavaleiros do Código";
	}

}