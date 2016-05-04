package br.com.anteros.demo.hotel.model;

import java.io.Serializable;

import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;


@Entity
@Table(name="ESTADIA_QUARTO")
public class EstadiaQuarto implements Serializable {

	@Id
	@Column(name = "ID_ESTADIA_QUARTO", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_ESTADIA_QUARTO", initialValue = 1)
	private Long id;
	
	@ForeignKey
	@Column(name="ID_ESTADIA", required=true)
	private Estadia estadia;
	
    @ForeignKey
	@Column(name="ID_QUARTO", required=true)
	private Quarto quarto;
	
	@Column(name="NR_PESSOAS", precision=2)
	private Long numeroPessoas;
	
	public EstadiaQuarto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estadia getEstadia() {
		return estadia;
	}

	public void setEstadia(Estadia estadia) {
		this.estadia = estadia;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Long getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(Long numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
	
	
	
}
