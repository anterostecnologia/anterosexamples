package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Quarto;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "QuartoService", description = "Quartos")
public interface QuartoService extends SQLServiceSecured<Quarto, Long> {

}
