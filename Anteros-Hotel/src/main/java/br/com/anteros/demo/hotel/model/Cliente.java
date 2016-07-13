package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import br.com.anteros.demo.hotel.model.type.Estado;
import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.Lob;
import br.com.anteros.persistence.metadata.annotation.OneToMany;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.Temporal;
import br.com.anteros.persistence.metadata.annotation.type.FetchType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;
import br.com.anteros.persistence.metadata.annotation.type.TemporalType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Cliente")
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

	@ApiModelProperty(value = "Id do cliente.", required = true)
	@Id
	@Column(name = "ID_CLIENTE", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_CLIENTE", initialValue = 1)
	private Long id;

	@ApiModelProperty(value = "Nome do cliente.")
	@Column(name = "DS_NOME", length = 60)
	private String nome;

	@Column(name = "DS_NACIONALIDADE", length = 40)
	private String nacionalidade;

	@Column(name = "DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;

	@Column(name = "DS_ENDERECO", length = 60)
	private String endereco;

	@Column(name = "CEP", length = 9)
	private String cep;

	@Column(name = "DS_CIDADE", length = 50)
	private String cidade;

	@Column(name = "UF_ESTADO", length = 2)
	private Estado estado;

	@Column(name = "TELEFONE", length = 20)
	private String telefone;

	@Column(name = "CELULAR", length = 20)
	private String celular;

	@Column(name = "RG", length = 30)
	private String rg;

	@Column(name = "DT_EXPEDICAO")
	private LocalDate dtExpedicao;

	@Column(name = "EMAIL", length = 500)
	private String email;

	@Column(name = "CNPJ", length = 14)
	private String cnpj;

	@Column(name = "CPF", length = 11)
	private String cpf;

	@Column(name = "PLACA", length = 20)
	private String placa;

	@Column(name = "FOTO")
	@Lob
	private byte[] foto;

	@ForeignKey
	@Column(name = "ID_HOTEL", required = true)
	private Hotel hotel;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Reserva> reservas;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Estadia> estadias;

	public Cliente() {

	}

	private Cliente(String nome, String endereco, String cep, String cidade, Estado estado, String telefone,
			String celular, String rg, LocalDate dtExpedicao, String email, String cnpj, String cpf, String placa,
			byte[] foto, Hotel hotel) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.celular = celular;
		this.rg = rg;
		this.dtExpedicao = dtExpedicao;
		this.email = email;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.placa = placa;
		this.foto = foto;
		this.hotel = hotel;

	}

	public static Cliente of(String nome, String endereco, String cep, String cidade, Estado estado, String telefone,
			String celular, String rg, LocalDate dtExpedicao, String email, String cnpj, String cpf, String placa,
			byte[] foto, Hotel hotel) {
		return new Cliente(nome, endereco, cep, cidade, estado, telefone, celular, rg, dtExpedicao, email, cnpj,
				cpf, placa, foto, hotel);
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

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDtExpedicao() {
		return dtExpedicao;
	}

	public void setDtExpedicao(LocalDate dtExpedicao) {
		this.dtExpedicao = dtExpedicao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public List<Estadia> getEstadias() {
		return estadias;
	}

	public void setEstadias(List<Estadia> estadias) {
		this.estadias = estadias;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
