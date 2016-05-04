package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.Temporal;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;
import br.com.anteros.persistence.metadata.annotation.type.TemporalType;


@Entity
@Table(name="ESTADIA_FATURA")
public class EstadiaFatura implements Serializable {

	@Id
	@Column(name = "ID_ESTADIA_FATURA", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_ESTADIA_FATURA", initialValue = 1)
	private Integer id;
	
	@ForeignKey
	@Column(name="ID_ESTADIA")
	private Estadia estadia;
	
	@Column(name="DT_FATURA")
	@Temporal(TemporalType.DATE)
	private Date dtFatura;
	
	@Column(name="VL_FATURA", precision=14, scale=2,required=true, defaultValue="0")
	private BigDecimal valor;
	
	
	public EstadiaFatura() {
	
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Estadia getEstadia() {
		return estadia;
	}


	public void setEstadia(Estadia estadia) {
		this.estadia = estadia;
	}


	public Date getDtFatura() {
		return dtFatura;
	}


	public void setDtFatura(Date dtFatura) {
		this.dtFatura = dtFatura;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
