package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.util.List;

import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.DiscriminatorColumn;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.Inheritance;
import br.com.anteros.persistence.metadata.annotation.ManyToOne;
import br.com.anteros.persistence.metadata.annotation.OneToMany;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.type.DiscriminatorType;
import br.com.anteros.persistence.metadata.annotation.type.FetchType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;
import br.com.anteros.persistence.metadata.annotation.type.InheritanceType;


@Entity
@Table(name="PRODUTO")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TP_PRODUTO", discriminatorType=DiscriminatorType.STRING, length=20)
public abstract class Produto implements Serializable {
	
	@Id	
	@Column(name = "ID_PRODUTO", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_PRODUTO", initialValue = 1)	
	private Long id;
	

	@Column(name="DS_PRODUTO", length=60)
	private String nome;

	@ManyToOne
	@Column(name="ID_HOTEL")
	private Hotel hotel;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="produto")
	private List<TabelaPreco> precos;

	public Produto() {
	
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<TabelaPreco> getPrecos() {
		return precos;
	}

	public void setPrecos(List<TabelaPreco> precos) {
		this.precos = precos;
	}
	
}
