package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Reserva;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "ReservaService", description = "Reservas")
public interface ReservaService extends SQLServiceSecured<Reserva, Long> {

}
