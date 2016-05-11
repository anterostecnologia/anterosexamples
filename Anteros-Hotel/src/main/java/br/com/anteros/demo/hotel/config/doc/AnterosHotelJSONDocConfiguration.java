package br.com.anteros.demo.hotel.config.doc;

import org.springframework.context.annotation.Configuration;

import br.com.anteros.jsondoc.springmvc.config.AnterosJSONDocConfiguration;

@Configuration
public class AnterosHotelJSONDocConfiguration extends AnterosJSONDocConfiguration {

	private String[] packages = {"br.com.anteros.demo.hotel.controller","br.com.anteros.demo.hotel.model"};
	
	@Override
	public String[] packagesSourceModelAndController() {
		return packages;
	}

	@Override
	public String versionApi() {
		return "1.0";
	}

	@Override
	public String basePath() {
		return "http://localhost:8070/api";
	}

}
