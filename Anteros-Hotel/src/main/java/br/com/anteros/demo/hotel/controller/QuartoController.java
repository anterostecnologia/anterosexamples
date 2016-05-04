package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Quarto;
import br.com.anteros.demo.hotel.service.QuartoService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/quarto")
public class QuartoController extends AbstractSQLRestController<Quarto, Long> {

	@Autowired
	private QuartoService quartoService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Quarto, Long> getService() {
		return quartoService;
	}

}