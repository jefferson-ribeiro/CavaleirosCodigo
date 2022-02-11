package br.com.example.cavcod.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.cavcod.dao.ContaDao;
import br.com.example.cavcod.models.Conta;

//import para indicar que tratasse do controlador principal
@RestController
@CrossOrigin
//Classe inicial da aplicação 
public class ContasController {
	// habilita a importação do banco de dados
	@Autowired
	
	private ContaDao contaDao; // objeto que interage com o banco de dados

	// Definindo uma rota coringa
	@GetMapping("/contas") // Mostra todas as contas e seus clientes relacionados
	// Recebendo o parametro da rota coringa
	// Path usado para busca unica
	public ArrayList<Conta> listaClientes() {
		// Mostrando na tela o valor da rota coringa
		var listaContas = contaDao.findAll();
		return (ArrayList<Conta>) listaContas;
	}

	@GetMapping("/conta/{id}") // mostra uma conta especifica e seu cliente relacionado (id refere-se ao número da conta, pois é o primary key)
	public Conta detalheClinte(@PathVariable int id) {
		// Mostrando na tela o valor da rota coringa
		// return "O resultado do parametro é "+id;
		return contaDao.findById(id).orElse(null);
	}

}