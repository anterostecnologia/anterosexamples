package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Estadia;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "EstadiaService", description = "Estadias")
public interface EstadiaService extends SQLServiceSecured<Estadia, Long> {

}
