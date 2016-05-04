package br.com.anteros.demo.hotel.model.type;

import java.io.Serializable;

public enum ReservaStatus implements Serializable {
	ABERTA("ABERTA"), CANCELADA("CANCELADA"), CONCLUIDA("CONCLUÍDA");

	private ReservaStatus(String name) {

	}
}
