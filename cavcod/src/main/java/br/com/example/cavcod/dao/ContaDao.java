package br.com.example.cavcod.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.example.cavcod.models.Conta;

//Criar uma classe para ClienteDao que herda tudo do CrudoRepository (onde já tem os metodos para fazer uma query);
public interface ContaDao extends CrudRepository<Conta, Integer> {

}
