package com.sos2.SOS2.entidade;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_funcionario;
	String Nome;
	String email;
	String username;
	String senha;
	String telefone;
	String nascimento;
	String cpf;
	String rg;
	String sexo;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	Empresa empresa;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(Long id_funcionario, String nome, String email, String username, String senha, String telefone,
			String nascimento, String cpf, String rg, String sexo, Empresa empresa) {
		this.id_funcionario = id_funcionario;
		Nome = nome;
		this.email = email;
		this.username = username;
		this.senha = senha;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Long getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id_funcionario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(id_funcionario, other.id_funcionario);
	}
	
}
