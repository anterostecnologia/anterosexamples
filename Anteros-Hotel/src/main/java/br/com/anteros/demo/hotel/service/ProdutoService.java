package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Produto;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "ProdutoService", description = "Produtos")
public interface ProdutoService extends SQLServiceSecured<Produto, Long> {

}
