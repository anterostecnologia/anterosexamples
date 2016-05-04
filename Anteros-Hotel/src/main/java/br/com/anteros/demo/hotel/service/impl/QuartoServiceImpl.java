package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Quarto;
import br.com.anteros.demo.hotel.service.QuartoService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("quartoService")
@Scope("prototype")
public class QuartoServiceImpl extends SpringSQLService<Quarto, Long> implements QuartoService {

}
