package br.com.anteros.demo.hotel.model.type;

import java.io.Serializable;

public enum FuncionarioStatus implements Serializable {
	ATIVO("ATIVO"), INATIVO("INATIVO");

	private FuncionarioStatus(String name) {

	}
}
