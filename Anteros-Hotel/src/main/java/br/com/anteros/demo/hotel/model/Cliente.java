package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
@Table(name="CLIENTE")
public class Cliente implements Serializable {

	@ApiModelProperty(value = "Id do cliente.", required=true)
	@Id
	@Column(name = "ID_CLIENTE", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_CLIENTE", initialValue = 1)
	private Integer id;
	
	@ApiModelProperty(value = "Nome do cliente.")
	@Column(name="DS_NOME", length=60)
	private String nome;
	
	@Column(name="DS_NACIONALIDADE", length=40)
	private String nacionalidade;
	
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	
	@Column(name="DS_ENDERECO", length=60)
	private String endereco;
	
	@Column(name="CEP", length=9)
	private String cep;

	
	@Column(name="DS_CIDADE", length=50)
	private String cidade;
	
	@Column(name="UF_ESTADO", length=2)
	private String estado;
	
	@Column(name="TELEFONE", length=20)
	private String telefone;
	
	@Column(name="CELULAR", length=20)
	private String celular;
	
	@Column(name="NR_DOCUMENTO", length=30)
	private String documento;
	
	@Column(name="DT_DOCUMENTO")
	private Date dtDocumento;
	
	@Column(name="EMAIL", length=500)
	private String email;
	
	@Column(name="CNPJ", length=14)
	private String cnpj;
	
	@Column(name="CPF", length=11)
	private String cpf;
	
	@Column(name="PLACA", length=20)
	private String placa;
	
	@Column(name="FOTO")
    @Lob 
    private byte[] foto;
	
	@ForeignKey
	@Column(name="ID_HOTEL", required=true)
	private Hotel hotel;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
	private List<Reserva> reservas;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
	private List<Estadia> estadias;

	public Cliente() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getDtDocumento() {
		return dtDocumento;
	}

	public void setDtDocumento(Date dtDocumento) {
		this.dtDocumento = dtDocumento;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
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
