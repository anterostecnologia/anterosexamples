package br.com.anteros.demo.hotel.model.type;

import java.io.Serializable;

public enum QuartoStatus implements Serializable {
	DISPONIVEL("DISPONIVEL"), MANUTENCAO("MANUTENÇÃO");

	private QuartoStatus(String name) {

	}
}
