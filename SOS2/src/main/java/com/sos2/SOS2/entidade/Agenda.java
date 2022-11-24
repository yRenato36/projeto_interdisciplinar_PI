package com.sos2.SOS2.entidade;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Agenda implements Serializable{
	private static final Long SERIALID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_agenda;
	int dia;
	String dia_semana;
	int horario_inicio;
	int horario_fim;
	String servico;
	String protocolo;
	String observacao;
	@ManyToOne
	@JoinColumn(name = "id_usuario") // cria a campo para chave estrangeira
	Usuario usuario; // definindo uma variável tipo entidade, é necessário colocar esse tipo no construtor e criar getter and setter
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	Empresa empresa;

	public Agenda() {
		
	}
	
	public Agenda(Long id_agenda, int dia, String dia_semana, int horario_inicio, int horario_fim, String servico, Usuario usuario, Empresa empresa, String protocolo, String observacao) {
		this.id_agenda = id_agenda;
		this.dia = dia;
		this.dia_semana = dia_semana;
		this.horario_inicio = horario_inicio;
		this.horario_fim = horario_fim;
		this.servico = servico;
		this.usuario = usuario;
		this.empresa = empresa;
		this.protocolo = protocolo;
		this.observacao = observacao;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId_agenda() {
		return id_agenda;
	}

	public void setId_agenda(Long id_agenda) {
		this.id_agenda = id_agenda;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getDia_semana() {
		return dia_semana;
	}

	public void setDia_semana(String dia_semana) {
		this.dia_semana = dia_semana;
	}

	public int getHorario_inicio() {
		return horario_inicio;
	}

	public void setHorario_inicio(int horario_inicio) {
		this.horario_inicio = horario_inicio;
	}

	public int getHorario_fim() {
		return horario_fim;
	}

	public void setHorario_fim(int horario_fim) {
		this.horario_fim = horario_fim;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	
	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
