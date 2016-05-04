package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Reserva;
import br.com.anteros.demo.hotel.service.ReservaService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/reserva")
public class ReservaController extends AbstractSQLRestController<Reserva, Long> {

	@Autowired
	private ReservaService reservaService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Reserva, Long> getService() {
		return reservaService;
	}

}