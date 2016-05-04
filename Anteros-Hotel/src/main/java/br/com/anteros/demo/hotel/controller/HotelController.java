package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Hotel;
import br.com.anteros.demo.hotel.service.HotelService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/hotel")
public class HotelController extends AbstractSQLRestController<Hotel, Long> {

	@Autowired
	private HotelService hotelService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Hotel, Long> getService() {
		return hotelService;
	}

}