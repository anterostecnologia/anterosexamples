package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.TabelaPreco;
import br.com.anteros.demo.hotel.service.TabelaPrecoService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/tabelapreco")
public class TabelaPrecoController extends AbstractSQLRestController<TabelaPreco, Long> {

	@Autowired
	private TabelaPrecoService tabelaPrecoService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<TabelaPreco, Long> getService() {
		return tabelaPrecoService;
	}

}