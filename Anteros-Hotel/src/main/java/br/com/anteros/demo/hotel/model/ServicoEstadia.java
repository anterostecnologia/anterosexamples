package br.com.anteros.demo.hotel.model;

import java.io.Serializable;

import br.com.anteros.persistence.metadata.annotation.DiscriminatorValue;
import br.com.anteros.persistence.metadata.annotation.Entity;


@Entity
@DiscriminatorValue(value="SERVICO")
public class ServicoEstadia extends Produto implements Serializable {

	public ServicoEstadia() {
		
	}

}
