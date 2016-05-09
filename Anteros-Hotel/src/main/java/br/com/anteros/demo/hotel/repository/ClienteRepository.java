package br.com.anteros.demo.hotel.repository;

import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.persistence.session.repository.SQLRepository;

public interface ClienteRepository extends SQLRepository<Cliente, Long> {

}
