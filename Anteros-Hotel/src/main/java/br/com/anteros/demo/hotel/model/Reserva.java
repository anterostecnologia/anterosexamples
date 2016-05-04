package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.anteros.demo.hotel.model.type.ReservaStatus;
import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.Enumerated;
import br.com.anteros.persistence.metadata.annotation.Fetch;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.JoinColumn;
import br.com.anteros.persistence.metadata.annotation.JoinTable;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.Temporal;
import br.com.anteros.persistence.metadata.annotation.type.EnumType;
import br.com.anteros.persistence.metadata.annotation.type.FetchMode;
import br.com.anteros.persistence.metadata.annotation.type.FetchType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;
import br.com.anteros.persistence.metadata.annotation.type.TemporalType;

@Entity
@Table(name = "RESERVA")
public class Reserva implements Serializable {

	@Id
	@Column(name = "ID_RESERVA", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_RESERVA", initialValue = 1)	
	private Long id;

	@Column(name = "DT_RESERVA")
	@Temporal(TemporalType.DATE_TIME)
	private Date dtReserva;

	@Column(name = "NR_PESSOAS", precision=2)
	private Long numeroPessoas;

	@Column(name = "DT_ENTRADA_PREVISTA")
	@Temporal(TemporalType.DATE)
	private Date dtEntradaPrevista;

	@Column(name = "DT_SAIDA_PREVISTA")
	@Temporal(TemporalType.DATE)
	private Date dtSaidaPrevista;

	@Column(name = "STATUS", length=15)
	@Enumerated(EnumType.STRING)
	private ReservaStatus status;

	@ForeignKey
	@Column(name = "ID_CLIENTE")
	private Cliente cliente;

	@ForeignKey
	@Column(name = "ID_HOTEL")
	private Hotel hotel;
	
	@Fetch(type = FetchType.LAZY, mode = FetchMode.MANY_TO_MANY)
	@JoinTable(name = "RESERVA_QUARTO", joinColumns = @JoinColumn(name = "ID_RESERVA", referencedColumnName = "ID_RESERVA"), inversedJoinColumns = @JoinColumn(name = "ID_QUARTO", referencedColumnName = "ID_QUARTO"))
	private List<Quarto> quartos = new ArrayList<Quarto>();

	public Reserva() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtReserva() {
		return dtReserva;
	}

	public void setDtReserva(Date dtReserva) {
		this.dtReserva = dtReserva;
	}

	public Long getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(Long numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}

	public Date getDtEntradaPrevista() {
		return dtEntradaPrevista;
	}

	public void setDtEntradaPrevista(Date dtEntradaPrevista) {
		this.dtEntradaPrevista = dtEntradaPrevista;
	}

	public Date getDtSaidaPrevista() {
		return dtSaidaPrevista;
	}

	public void setDtSaidaPrevista(Date dtSaidaPrevista) {
		this.dtSaidaPrevista = dtSaidaPrevista;
	}

	public ReservaStatus getStatus() {
		return status;
	}

	public void setStatus(ReservaStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}
