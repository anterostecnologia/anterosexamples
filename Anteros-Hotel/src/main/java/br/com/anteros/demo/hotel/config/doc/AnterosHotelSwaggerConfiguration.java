package br.com.anteros.demo.hotel.config.doc;

import org.springframework.context.annotation.Configuration;

import br.com.anteros.swagger.AnterosSwaggerConfiguration;

@Configuration
public class AnterosHotelSwaggerConfiguration extends AnterosSwaggerConfiguration{

	@Override
	public String title() {
		return "Anteros Hotel REST API";
	}

	@Override
	public String description() {
		return "API REST do Anteros Hotel.";
	}

	@Override
	public String version() {
		return "Versão API 1.0";
	}

	@Override
	public String termsOfServiceUrl() {
		return "Termos de uso";
	}

	@Override
	public String contactName() {
		return "edsonmartins2005@gmail.com";
	}

	@Override
	public String license() {
		return "API License";
	}

	@Override
	public String licenseUrl() {
		return "http://www.apache.org/licenses/LICENSE-2.0";
	}

}