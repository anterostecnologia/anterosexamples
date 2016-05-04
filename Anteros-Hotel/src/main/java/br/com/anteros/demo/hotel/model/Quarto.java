package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.anteros.demo.hotel.model.type.QuartoStatus;
import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.Enumerated;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.Lob;
import br.com.anteros.persistence.metadata.annotation.ManyToMany;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.type.CascadeType;
import br.com.anteros.persistence.metadata.annotation.type.EnumType;
import br.com.anteros.persistence.metadata.annotation.type.FetchType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;



@Entity
@Table(name="QUARTO")
public class Quarto implements Serializable {

	@Id
	@Column(name = "ID_QUARTO", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_QUARTO", initialValue = 1)		
	private Long id;
	
	@Column(name="DS_QUARTO", length=40)
	private String descricao;
	
	@Column(name="CAPACIDADE", precision=2)
	private Long capacidade;
	
	@Column(name="FOTO")
    @Lob 
    private byte[] foto;
	
	@ForeignKey
	@Column(name="ID_HOTEL", required=true)
	private Hotel hotel;	
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="quartos", cascade=CascadeType.ALL)		
    private List<Reserva> reservas = new ArrayList<Reserva>();
	
	@Column(name="STATUS")
	@Enumerated(EnumType.STRING)
	private QuartoStatus status;
	
	public Quarto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Long capacidade) {
		this.capacidade = capacidade;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public QuartoStatus getStatus() {
		return status;
	}

	public void setStatus(QuartoStatus status) {
		this.status = status;
	}
	
	
	
}
