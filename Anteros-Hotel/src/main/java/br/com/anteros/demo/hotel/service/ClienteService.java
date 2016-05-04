package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Cliente;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "ClienteService", description = "Clientes")
public interface ClienteService extends SQLServiceSecured<Cliente, Long> {

}
