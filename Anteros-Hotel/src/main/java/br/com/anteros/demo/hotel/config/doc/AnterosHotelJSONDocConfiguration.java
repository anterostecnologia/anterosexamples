package br.com.anteros.demo.hotel.config.doc;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

import br.com.anteros.jsondoc.springmvc.config.AnterosJSONDocConfiguration;

@Configuration
public class AnterosHotelJSONDocConfiguration extends AnterosJSONDocConfiguration {

	@Override
	public String[] packagesSourceModelAndController() {
		ArrayList<String> packages = new ArrayList<>();
		packages.add("br.com.anteros.demo.hotel.controller");
		packages.add("br.com.anteros.demo.hotel.model");
		return packages.toArray(new String[] {});
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
