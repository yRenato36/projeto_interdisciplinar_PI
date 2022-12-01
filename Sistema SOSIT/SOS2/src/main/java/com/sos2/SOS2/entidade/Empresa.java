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

@Entity
public class Empresa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_empresa;
	String cnpj;
	String razao_social;
	String imagem_perfil;
	String imagem_empresa;
	String nome_fantasia;
	String sobre;
	String nome_contato;
	String email_contato;
	String telefone_contato;
	String cep;
	String estado;
	String rua;
	String numero;
	String cidade;
	String bairro;
	String complemento;
	String banco;
	String agencia;
	String digito;
	String tipo_conta;
	String numero_conta;
	
	@JsonIgnore
	@OneToMany(mappedBy = "empresa")
	List<Agenda> agendaEmpresa = new ArrayList(); // além de trazer uma lista de atributos, define qual classe será especificada no relacionamento
	
	@OneToMany(mappedBy = "empresa")
	List<Funcionario> funcionarios = new ArrayList();

	public Empresa() {

	}

	public Empresa(Long id_empresa, String cnpj, String razao_social, String imagem_perfil, String imagem_empresa,
			String nome_fantasia, String sobre, String nome_contato, String email_contato, String telefone_contato,
			String cep, String estado, String rua, String numero, String cidade, String bairro, String complemento,
			String banco, String agencia, String digito, String tipo_conta, String numero_conta) {
		this.id_empresa = id_empresa;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.imagem_perfil = imagem_perfil;
		this.imagem_empresa = imagem_empresa;
		this.nome_fantasia = nome_fantasia;
		this.sobre = sobre;
		this.nome_contato = nome_contato;
		this.email_contato = email_contato;
		this.telefone_contato = telefone_contato;
		this.cep = cep;
		this.estado = estado;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.banco = banco;
		this.agencia = agencia;
		this.digito = digito;
		this.tipo_conta = tipo_conta;
		this.numero_conta = numero_conta;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
		
	public List<Agenda> getAgendaEmpresa() {
		return agendaEmpresa;
	}
	
	public void setAgendaEmpresa(List<Agenda> agendaEmpresa) {
		this.agendaEmpresa = agendaEmpresa;
	}
	
	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getImagem_perfil() {
		return imagem_perfil;
	}

	public void setImagem_perfil(String imagem_perfil) {
		this.imagem_perfil = imagem_perfil;
	}

	public String getImagem_empresa() {
		return imagem_empresa;
	}

	public void setImagem_empresa(String imagem_empresa) {
		this.imagem_empresa = imagem_empresa;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getEmail_contato() {
		return email_contato;
	}

	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}

	public String getTelefone_contato() {
		return telefone_contato;
	}

	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public String getTipo_conta() {
		return tipo_conta;
	}

	public void setTipo_conta(String tipo_conta) {
		this.tipo_conta = tipo_conta;
	}

	public String getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(String numero_conta) {
		this.numero_conta = numero_conta;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_empresa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(id_empresa, other.id_empresa);
	}
	
	
	
}
