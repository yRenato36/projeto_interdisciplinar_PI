package com.sos2.SOS2.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity // indica a criação de uma entidade
public class Usuario implements Serializable {
	
	private static final Long SERIALID = 1L;
	@Id //indica qual é chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_usuario;
	String nome;
	String cpf;
	String nascimento;
	String telefone;
	String username;
	String senha;
	String email;
	String cep;
	String estado;
	String cidade;
	String bairro;
	String rua;
	String numero;
	String complemento;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario") // references
	List<Agenda> compromisso = new ArrayList<>(); // caso seja necessário criar um objeto, cria somente um get desse objeto
	
	public Usuario() {

	}
	
	public Usuario(Long id_usuario, String nome, String cpf, String nascimento, String telefone, String username, String senha,
			String email, String cep, String estado, String cidade, String bairro, String rua, String numero,String complemento) {
		this.id_usuario = id_usuario;
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.username = username;
		this.senha = senha;
		this.email = email;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}

	public Long getId() {
		return id_usuario;
	}

	public void setId(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public List<Agenda> getCompromisso() {
		return compromisso;
	}

	public void setCompromisso(List<Agenda> compromisso) {
		this.compromisso = compromisso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id_usuario, other.id_usuario);
	}
}
