package br.com.anteros.demo.hotel.model;

import java.io.Serializable;

import br.com.anteros.demo.hotel.model.type.FuncionarioStatus;
import br.com.anteros.persistence.metadata.annotation.Column;
import br.com.anteros.persistence.metadata.annotation.Entity;
import br.com.anteros.persistence.metadata.annotation.Enumerated;
import br.com.anteros.persistence.metadata.annotation.ForeignKey;
import br.com.anteros.persistence.metadata.annotation.GeneratedValue;
import br.com.anteros.persistence.metadata.annotation.Id;
import br.com.anteros.persistence.metadata.annotation.Lob;
import br.com.anteros.persistence.metadata.annotation.SequenceGenerator;
import br.com.anteros.persistence.metadata.annotation.Table;
import br.com.anteros.persistence.metadata.annotation.type.EnumType;
import br.com.anteros.persistence.metadata.annotation.type.GeneratedType;

@Entity
@Table(name="FUNCIONARIO")
public class Funcionario implements Serializable {

	@Id
	@Column(name = "ID_FUNCIONARIO", length = 8)
	@GeneratedValue(strategy = GeneratedType.AUTO)
	@SequenceGenerator(sequenceName = "SEQ_FUNCIONARIO", initialValue = 1)
	private Long id;
	
	@Column(name="DS_NOME", length=50)
	private String nome;
	
	@Column(name="LOGIN", length=20)
	private String login;
	
	@Column(name="SENHA", length=20)
	private String senha;
	
	@Column(name="FUNCAO", length=30)
	private String funcao;
	
	@Column(name="TP_STATUS", length=15)
	@Enumerated(EnumType.STRING)
	private FuncionarioStatus status;
	
	@ForeignKey
	@Column(name="ID_HOTEL", required=true)
	private Hotel hotel;
	
	@Column(name="FOTO")
    @Lob 
    private byte[] foto;
	
	public Funcionario() {
		
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
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

	public FuncionarioStatus getStatus() {
		return status;
	}

	public void setStatus(FuncionarioStatus status) {
		this.status = status;
	}

	
}
