package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Estadia;
import br.com.anteros.demo.hotel.service.EstadiaService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/estadia")
public class EstadiaController extends AbstractSQLRestController<Estadia, Long> {

	@Autowired
	private EstadiaService estadiaService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Estadia, Long> getService() {
		return estadiaService;
	}

}