package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;

@Entity
@Table(name="ESTADIA_PRODUTO")
public class EstadiaProduto implements Serializable {

	@Id
	@Column(name = "ID_ESTADIA_PRODUTO", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_ESTADIA_PRODUTO", initialValue = 1)
	private Integer id;
	
	@ForeignKey
	@Column(name="ID_ESTADIA", required=true)
	private Estadia estadia;
	
	@ForeignKey
	@Column(name="ID_PRODUTO")
	private Produto produto;
	
	@Column(name="VR_PRODUTO",precision=14, scale=2,required=true, defaultValue="0")
	private BigDecimal valor;
	
	@Column(name="QT_PRODUTO", precision=11, scale=3,required=true, defaultValue="0")
	private BigDecimal quantidade;
	
	@Column(name="VL_TOTAL", precision=14, scale=2,required=true, defaultValue="0")
	private BigDecimal valorTotal;
	
	public EstadiaProduto() {
	
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
