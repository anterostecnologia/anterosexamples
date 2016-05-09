package br.com.anteros.demo.hotel.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.demo.hotel.repository.ClienteRepository;
import br.com.anteros.persistence.session.SQLSessionFactory;
import br.com.anteros.persistence.session.repository.impl.GenericSQLRepository;

@Repository("clienteRepository")
public class ClienteRepositoryImpl extends GenericSQLRepository<Cliente, Long> implements ClienteRepository {

	@Autowired
	public ClienteRepositoryImpl(SQLSessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
