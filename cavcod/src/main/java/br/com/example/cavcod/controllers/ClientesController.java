package br.com.example.cavcod.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.cavcod.dao.ClienteDao;
import br.com.example.cavcod.models.Cliente;

//import para indicar que tratasse do controlador principal
@RestController
//Classe inicial da aplicação 
public class ClientesController {
	// importação do banco de dados
	@Autowired
	private ClienteDao clienteDao; // objeto que interage com o banco de dados

	@GetMapping("/clientes")// mostra todos os clientes
	public ArrayList<Cliente> listaClientes() {
		// Estancia do objeto Cliente(modelo feito em Models) para ser convertido
		// automaticamente em Json
		var lista = clienteDao.findAll();
		return (ArrayList<Cliente>) lista;
	}

	// Definindo uma rota coringa
	@GetMapping("/cliente/{id}")// mostra clientes por id
	// Recebendo o parametro da rota coringa
	// Path usado para busca unica
	public Cliente DetalheConta(@PathVariable int id) {
		// Mostrando na tela o valor da rota coringa
		// return "O resultado do parametro é "+id;
		return clienteDao.findById(id).orElse(null);
	}

}