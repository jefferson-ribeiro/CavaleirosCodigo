package br.com.example.cavcod.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.example.cavcod.models.Cliente;

//Criar uma classe para ClienteDao que herda tudo do CrudoRepository (onde já tem os metodos para fazer uma query);
public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
