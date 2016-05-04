package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Temporada;
import br.com.anteros.demo.hotel.service.TemporadaService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("temporadaService")
@Scope("prototype")
public class TemporadaServiceImpl extends SpringSQLService<Temporada, Long> implements TemporadaService {

}
