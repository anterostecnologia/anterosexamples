package br.com.anteros.demo.hotel;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.anteros.demo.hotel.config.AnterosHotelGlobalMethodSecurityConfiguration;
import br.com.anteros.demo.hotel.config.AnterosHotelMvcConfiguration;
import br.com.anteros.demo.hotel.config.AnterosHotelPersistenceConfiguration;
import br.com.anteros.demo.hotel.config.AnterosHotelSecurityConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AnterosHotelGlobalMethodSecurityConfiguration.class,
		AnterosHotelSecurityConfiguration.class, AnterosHotelPersistenceConfiguration.class,
		AnterosHotelMvcConfiguration.class })
@WebAppConfiguration
public class AbstractTest {

}
