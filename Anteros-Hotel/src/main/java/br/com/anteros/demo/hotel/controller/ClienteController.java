package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.demo.hotel.service.ClienteService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;


@RestController
@RequestMapping(value = "/cliente")
public class ClienteController extends AbstractSQLRestController<Cliente, Long> {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Cliente, Long> getService() {
		return clienteService;
	}

}