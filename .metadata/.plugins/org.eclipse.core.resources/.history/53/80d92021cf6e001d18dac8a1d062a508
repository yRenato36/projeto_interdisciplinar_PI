package com.sos2.SOS2.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Agenda implements Serializable {
	private static final Long SERIALID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_agenda;
	int vagas;
	String nome;
	String servico;
	String tipo_servico;
	String descricao_servico;
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	Empresa empresa;
	
	@JsonIgnore
	@OneToMany(mappedBy = "agenda")
	List<Agendamento> agendamentos = new ArrayList();

	public Agenda() {

	}

	public Agenda(Long id_agenda, int vagas, String nome,
			String servico, String tipo_servico, String descricao_servico, Empresa empresa, Agendamento agendamento) {
		this.id_agenda = id_agenda;
		this.vagas = vagas;
		this.nome = nome;
		this.servico = servico;
		this.tipo_servico = tipo_servico;
		this.descricao_servico = descricao_servico;
		this.empresa = empresa;
	}

	
	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public Long getId_agenda() {
		return id_agenda;
	}

	public void setId_agenda(Long id_agenda) {
		this.id_agenda = id_agenda;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getTipo_servico() {
		return tipo_servico;
	}

	public void setTipo_servico(String tipo_servico) {
		this.tipo_servico = tipo_servico;
	}

	public String getDescricao_servico() {
		return descricao_servico;
	}

	public void setDescricao_servico(String descricao_servico) {
		this.descricao_servico = descricao_servico;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id_agenda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(id_agenda, other.id_agenda);
	}

}
