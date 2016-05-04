package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Temporada;
import br.com.anteros.demo.hotel.service.TemporadaService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/temporada")
public class TemporadaController extends AbstractSQLRestController<Temporada, Long> {

	@Autowired
	private TemporadaService temporadaService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Temporada, Long> getService() {
		return temporadaService;
	}

}