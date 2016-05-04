package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Estadia;
import br.com.anteros.demo.hotel.service.EstadiaService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("estadiaService")
@Scope("prototype")
public class EstadiaServiceImpl extends SpringSQLService<Estadia, Long> implements EstadiaService {

}
