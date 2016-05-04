package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Reserva;
import br.com.anteros.demo.hotel.service.ReservaService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("reservaService")
@Scope("prototype")
public class ReservaServiceImpl extends SpringSQLService<Reserva, Long> implements ReservaService {

}
