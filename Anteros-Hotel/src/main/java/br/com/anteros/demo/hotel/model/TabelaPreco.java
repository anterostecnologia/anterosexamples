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
@Table(name="TABELA_PRECO")
public class TabelaPreco implements Serializable {

	@Id
	@Column(name = "ID_TABELA_PRECO", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_TABELA_PRECO", initialValue = 1)	
	private Long id;
	
	@Column(name="DT_VALIDADE_INICIAL")
	@Temporal(TemporalType.DATE)
	private Date dtValidadeInicial;
	
	@Column(name="DT_VALIDADE_FINAL")
	@Temporal(TemporalType.DATE)
	private Date dtValidadeFinal;
	
	@Column(name="NR_PESSOAS", length=2)
	private Long numeroPessoas;
	
	@Column(name="VL_PRODUTO",precision=14, scale=2,required=true, defaultValue="0")
	private BigDecimal valor;
	
	@ForeignKey
	@Column(name="ID_PRODUTO", required=true)
	private Produto produto;
	
	public TabelaPreco() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtValidadeInicial() {
		return dtValidadeInicial;
	}

	public void setDtValidadeInicial(Date dtValidadeInicial) {
		this.dtValidadeInicial = dtValidadeInicial;
	}

	public Date getDtValidadeFinal() {
		return dtValidadeFinal;
	}

	public void setDtValidadeFinal(Date dtValidadeFinal) {
		this.dtValidadeFinal = dtValidadeFinal;
	}

	public Long getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(Long numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
