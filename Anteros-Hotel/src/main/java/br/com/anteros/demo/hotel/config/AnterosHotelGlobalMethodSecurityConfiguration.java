package br.com.anteros.demo.hotel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import br.com.anteros.security.spring.config.AnterosSpringGlobalMethodSecurityConfiguration;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled=true)
public class AnterosHotelGlobalMethodSecurityConfiguration  extends AnterosSpringGlobalMethodSecurityConfiguration{

}
