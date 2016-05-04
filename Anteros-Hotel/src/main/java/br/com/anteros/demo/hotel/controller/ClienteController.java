package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.demo.hotel.service.ClienteService;
import br.com.anteros.jsondoc.core.annotation.RestApiAuthNone;
import br.com.anteros.jsondoc.core.annotation.RestApiVersion;
import br.com.anteros.jsondoc.core.pojo.ApiStage;
import br.com.anteros.jsondoc.core.pojo.ApiVisibility;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;


@br.com.anteros.jsondoc.core.annotation.RestApi(name = "Cliente services", description = "Methods for managing cities", group = "Geography", visibility = ApiVisibility.PUBLIC, stage = ApiStage.RC)
@RestApiVersion(since = "1.0", until = "2.12")
@RestApiAuthNone
@io.swagger.annotations.Api(value="Clientes API")
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