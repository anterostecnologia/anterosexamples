package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.TabelaPreco;
import br.com.anteros.demo.hotel.service.TabelaPrecoService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("tabelaPrecoService")
@Scope("prototype")
public class TabelaPrecoServiceImpl extends SpringSQLService<TabelaPreco, Long> implements TabelaPrecoService {

}
