package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Funcionario;
import br.com.anteros.demo.hotel.service.FuncionarioService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController extends AbstractSQLRestController<Funcionario, Long> {

	@Autowired
	private FuncionarioService funcionarioService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Funcionario, Long> getService() {
		return funcionarioService;
	}

}