package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Funcionario;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "FuncionarioService", description = "Funcionários")
public interface FuncionarioService extends SQLServiceSecured<Funcionario, Long> {

}
