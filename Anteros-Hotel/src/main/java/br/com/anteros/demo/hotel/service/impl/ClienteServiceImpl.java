package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.demo.hotel.service.ClienteService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("clienteService")
@Scope("prototype")
public class ClienteServiceImpl extends SpringSQLService<Cliente, Long> implements ClienteService {

}
