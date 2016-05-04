package br.com.anteros.demo.hotel.model.type;

import java.io.Serializable;

public enum TipoCartaoCredito implements Serializable {
	MASTER_CARD("MASTER CARD"), VISA("VISA"),
	AMERICAN_EXPRESS("AMERICAN EXPRESS"),
	DISCOVER("DISCOVER"),
	DINERS_CLUB("DINERS CLUB");

	private TipoCartaoCredito(String name) {

	}
}
