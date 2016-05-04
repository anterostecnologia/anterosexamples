package br.com.anteros.demo.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.demo.hotel.model.Produto;
import br.com.anteros.demo.hotel.service.ProdutoService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityService;
import br.com.anteros.springWeb.controller.AbstractSQLRestController;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController extends AbstractSQLRestController<Produto, Long> {

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	protected AnterosSecurityService anterosSecurityService;

	@Override
	public SQLService<Produto, Long> getService() {
		return produtoService;
	}

}