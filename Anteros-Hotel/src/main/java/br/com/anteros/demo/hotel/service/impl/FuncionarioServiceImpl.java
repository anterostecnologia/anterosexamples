package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Funcionario;
import br.com.anteros.demo.hotel.service.FuncionarioService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("funcionarioService")
@Scope("prototype")
public class FuncionarioServiceImpl extends SpringSQLService<Funcionario, Long> implements FuncionarioService {

}
