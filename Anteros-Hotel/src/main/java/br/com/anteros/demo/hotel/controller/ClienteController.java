package br.com.anteros.demo.hotel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.demo.hotel.service.ClienteService;
import br.com.anteros.jsondoc.core.annotation.DocApiAuthNone;
import br.com.anteros.jsondoc.core.annotation.DocApiResponseObject;
import br.com.anteros.jsondoc.core.annotation.DocApiVersion;
import br.com.anteros.jsondoc.core.pojo.ApiStage;
import br.com.anteros.jsondoc.core.pojo.ApiVisibility;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;
import io.swagger.annotations.Api;


@br.com.anteros.jsondoc.core.annotation.DocApi(name = "Cliente services", description = "Methods for managing cities", group = "Geography", visibility = ApiVisibility.PUBLIC, stage = ApiStage.RC)
@DocApiVersion(since = "1.0", until = "2.12")
@DocApiAuthNone
@Api(value="Clientes API")
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
	
	@Override
	public @DocApiResponseObject Cliente findOne(HttpServletRequest request, HttpServletResponse response, Long id) throws Exception {
		return super.findOne(request, response, id);
	}

}