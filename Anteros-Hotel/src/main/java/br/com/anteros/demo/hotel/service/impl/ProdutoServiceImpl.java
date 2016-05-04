package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Produto;
import br.com.anteros.demo.hotel.service.ProdutoService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("produtoService")
@Scope("prototype")
public class ProdutoServiceImpl extends SpringSQLService<Produto, Long> implements ProdutoService {

}
