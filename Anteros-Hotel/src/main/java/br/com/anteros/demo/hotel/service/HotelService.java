package br.com.anteros.demo.hotel.service;

import br.com.anteros.demo.hotel.model.Hotel;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.service.SQLServiceSecured;

@ResourceSecured(resourceName = "HotelService", description = "Hotéis")
public interface HotelService  extends SQLServiceSecured<Hotel, Long> {


}
