package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import br.com.anteros.demo.hotel.model.type.TipoCartaoCredito;
import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.Enumerated;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.OneToMany;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.Temporal;
import br.com.anteros.persistence.metadata.annotation.type.EnumType;
import br.com.anteros.persistence.metadata.annotation.type.FetchType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;
import br.com.anteros.persistence.metadata.annotation.type.TemporalType;

@Entity
@Table(name="ESTADIA")
public class Estadia implements Serializable  {

	@Id
	@Column(name = "ID_ESTADIA", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_ESTADIA", initialValue = 1)
	private Long id;
	
	@Column(name="NR_PESSOAS", precision=2)
	private Long numeroPessoas;
	
	@Column(name="DT_ENTRADA")
	@Temporal(TemporalType.DATE_TIME)
	private Date dtEntrada;
	
	@Column(name="DT_SAIDA")
	@Temporal(TemporalType.DATE_TIME)
	private Date dtSaida;
	
	@Column(name="NR_CARTAOCREDITO", length=16)
	private String nrCartaoCredito;
	
	@Column(name="TP_CARTAOCREDITO", length=20)
	@Enumerated(EnumType.STRING)
	private TipoCartaoCredito tipoCartaoCredito;
	
	@Column(name="TITULAR_CARTAOCREDITO", length=50)
	private String titularCartaoCredito;
	
	@Column(name="DT_EXPIRACAO_CARTAO")
	@Temporal(TemporalType.DATE)
	private Date dtExpiracaoCartao;
	
	@ForeignKey
	@Column(name="ID_CLIENTE")
	private Cliente cliente;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="estadia")
	private List<EstadiaProduto> produtos;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="estadia")
	private List<EstadiaQuarto> quartos;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="estadia")
	private List<EstadiaFatura> faturas;
	
	public Estadia() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(Long numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}

	public Date getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(Date dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public Date getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}

	public String getNrCartaoCredito() {
		return nrCartaoCredito;
	}

	public void setNrCartaoCredito(String nrCartaoCredito) {
		this.nrCartaoCredito = nrCartaoCredito;
	}

	public String getTitularCartaoCredito() {
		return titularCartaoCredito;
	}

	public void setTitularCartaoCredito(String titularCartaoCredito) {
		this.titularCartaoCredito = titularCartaoCredito;
	}

	public Date getDtExpiracaoCartao() {
		return dtExpiracaoCartao;
	}

	public void setDtExpiracaoCartao(Date dtExpiracaoCartao) {
		this.dtExpiracaoCartao = dtExpiracaoCartao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<EstadiaProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<EstadiaProduto> produtos) {
		this.produtos = produtos;
	}

	public List<EstadiaQuarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(List<EstadiaQuarto> quartos) {
		this.quartos = quartos;
	}

	public List<EstadiaFatura> getFaturas() {
		return faturas;
	}

	public void setFaturas(List<EstadiaFatura> faturas) {
		this.faturas = faturas;
	}

	public TipoCartaoCredito getTipoCartaoCredito() {
		return tipoCartaoCredito;
	}

	public void setTipoCartaoCredito(TipoCartaoCredito tipoCartaoCredito) {
		this.tipoCartaoCredito = tipoCartaoCredito;
	}
	
	

}
