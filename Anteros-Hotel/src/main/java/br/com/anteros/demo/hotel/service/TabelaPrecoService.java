package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.TabelaPreco;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "TabelaPrecoService", description = "Tabela preços")
public interface TabelaPrecoService extends SQLServiceSecured<TabelaPreco, Long> {

}
