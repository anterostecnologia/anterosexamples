package br.com.anteros.demo.hotel.model;

import java.io.Serializable;
import java.util.List;

import br.com.anteros.demo.hotel.model.type.CategoriaHotel;
import br.com.anteros.demo.hotel.model.type.Estado;
import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.Enumerated;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.OneToMany;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.type.EnumType;
import br.com.anteros.persistence.metadata.annotation.type.FetchType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;

@Entity
@Table(name = "HOTEL")
public class Hotel implements Serializable {

	@Id
	@Column(name = "ID_HOTEL", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_HOTEL", initialValue = 1)
	private Long id;

	@Column(name = "DS_NOME", length = 40, required = true)
	private String nome;

	@Column(name = "DS_ENDERECO", length = 40, required = true)
	private String endereco;

	@Column(name = "CEP", length = 8, required = true)
	private String cep;

	@Column(name = "TELEFONE", length = 11)
	private String telefone;

	@Column(name = "DS_CIDADE", length = 40, required = true)
	private String cidade;

	@Column(name = "DS_ESTADO", length = 2, required = true)
	@Enumerated(EnumType.STRING)
	private Estado estado;

	@Column(name = "CNPJ", length = 14, required = true)
	private String cnpj;

	@Column(name = "CATEGORIA", length = 20, required = true)
	@Enumerated(EnumType.STRING)
	private CategoriaHotel categoria;

	@Column(name = "EMAIL", length = 500)
	private String email;

	@Column(name = "HOMEPAGE", length = 500)
	private String homePage;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
	private List<Quarto> quartos;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
	private List<Funcionario> funcionarios;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
	private List<Cliente> clientes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
	private List<Produto> produtos;

	public Hotel() {

	}

	private Hotel(String nome, String endereco, String cep, String telefone, String cidade, Estado estado, String cnpj,
			CategoriaHotel categoria, String email, String homePage) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.cidade = cidade;
		this.estado = estado;
		this.cnpj = cnpj;
		this.categoria = categoria;
		this.email = email;
		this.homePage = homePage;
	}

	public static Hotel of(String nome, String endereco, String cep, String telefone, String cidade, Estado estado,
			String cnpj, CategoriaHotel categoria, String email, String homePage) {
		return new Hotel(nome, endereco, cep, telefone, cidade, estado, cnpj, categoria, email, homePage);
	}

	public String getNome() {
		return nome;
	}

	public Hotel setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getEndereco() {
		return endereco;
	}

	public Hotel setEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}

	public String getTelefone() {
		return telefone;
	}

	public Hotel setTelefone(String telefone) {
		this.telefone = telefone;
		return this;
	}

	public CategoriaHotel getCategoria() {
		return categoria;
	}

	public Hotel setCategoria(CategoriaHotel categoria) {
		this.categoria = categoria;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Hotel setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getHomePage() {
		return homePage;
	}

	public Hotel setHomePage(String homePage) {
		this.homePage = homePage;
		return this;
	}

	public Long getId() {
		return id;
	}

	public Hotel setId(Long id) {
		this.id = id;
		return this;
	}

	public List<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getCidade() {
		return cidade;
	}

	public Hotel setCidade(String cidade) {
		this.cidade = cidade;
		return this;
	}

	public Estado getEstado() {
		return estado;
	}

	public Hotel setEstado(Estado estado) {
		this.estado = estado;
		return this;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Hotel setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public Hotel setCep(String cep) {
		this.cep = cep;
		return this;
	}
}
