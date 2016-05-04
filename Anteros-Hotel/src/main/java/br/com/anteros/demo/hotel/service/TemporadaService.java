package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Temporada;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "TemporadaService", description = "Temporadas")
public interface TemporadaService extends SQLServiceSecured<Temporada, Long> {

}
