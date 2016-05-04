package br.com.anteros.demo.hotel.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.demo.hotel.model.Hotel;
import br.com.anteros.demo.hotel.service.HotelService;
import br.com.anteros.spring.service.SpringSQLService;

@Service("hotelService")
@Scope("prototype")
public class HotelServiceImpl extends SpringSQLService<Hotel, Long> implements HotelService {

}
