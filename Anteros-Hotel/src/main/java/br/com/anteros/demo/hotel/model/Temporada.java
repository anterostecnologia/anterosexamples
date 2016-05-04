package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.util.Date;

import br.com.anteros.demo.hotel.model.type.TemporadaTipo;
import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.Enumerated;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.JoinColumn;
import br.com.anteros.persistence.metadata.annotation.ManyToOne;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.Temporal;
import br.com.anteros.persistence.metadata.annotation.type.EnumType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;
import br.com.anteros.persistence.metadata.annotation.type.TemporalType;

/**
 * Classe que representa a Temporada. Ela define como as estadias serão tratadas no período.
 * A temporada é utilizada nos cadastros de {@link Hotel} e {@link TabelaPreco}.
 * Também é utilizada nas operações de {@link Reserva} e {@link Estadia}
 * 
 * @author Henrique Soares
 * @since 31/03/2010
 * 
 * @see {@link Hotel}
 * @see {@link TabelaPreco}
 * @see {@link Reserva}
 * @see {@link Estadia}
 */
@Entity
@Table(name="TEMPORADA")
public class Temporada implements Serializable {

	@Id
	@Column(name = "ID_TEMPORADA", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_TEMPORADA", initialValue = 1)	
	private Integer id;
	
	@Column(name="DS_TEMPORADA", length=40)
	private String dsTemporada;	
	
	@Column(name="TP_TEMPORADA", length=10)
	@Enumerated(EnumType.STRING)
	private TemporadaTipo tpTemporada;	
	
	@ForeignKey
	@Column(name="ID_GERENTE", inversedColumn="ID_FUNCIONARIO", required=true)
	private Funcionario gerente;	
		
	@Column(name="DT_INICIAL")
	@Temporal(TemporalType.DATE)
	private Date dtInicial;
	
	@Column(name="DT_FINAL")
	@Temporal(TemporalType.DATE)
	private Date dtFinal;	
	
	@Column(name="PC_DESCONTO", precision=5, scale=2, defaultValue="0")
	private Double pcDesconto;	
	
	@Column(name="VL_TAXA", precision=14, scale=2, defaultValue="0")
	private Double vlTaxa;	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDsTemporada() {
		return dsTemporada;
	}

	public void setDsTemporada(String dsTemporada) {
		this.dsTemporada = dsTemporada;
	}

	public Date getDtInicial() {
		return dtInicial;
	}

	public void setDtInicial(Date dtInicial) {
		this.dtInicial = dtInicial;
	}

	public Date getDtFinal() {
		return dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	public TemporadaTipo getTpTemporada() {
		return tpTemporada;
	}

	public void setTpTemporada(TemporadaTipo tpTemporada) {
		this.tpTemporada = tpTemporada;
	}

	public Funcionario getGerente() {
		return gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}

	public Double getPcDesconto() {
		return pcDesconto;
	}

	public void setPcDesconto(Double pcDesconto) {
		this.pcDesconto = pcDesconto;
	}

	public Double getVlTaxa() {
		return vlTaxa;
	}

	public void setVlTaxa(Double vlTaxa) {
		this.vlTaxa = vlTaxa;
	}
	
}
