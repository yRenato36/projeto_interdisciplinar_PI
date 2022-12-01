package com.sos2.SOS2.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compromisso implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_compromisso;
	String data;
	
	@ManyToOne
	@JoinColumn(name = "id_agendamento")
	Agendamento agendamento;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	Usuario usuario;
	
	public Compromisso() {
		
	}
	
	public Compromisso(Long id_compromisso, String data, Long id_agendamento, 
			Agendamento agendamento, Usuario usuario) {
		this.id_compromisso = id_compromisso;
		this.data = data;
		this.usuario = usuario;
		this.agendamento = agendamento;
	}

	public Long getId_compromisso() {
		return id_compromisso;
	}

	public void setId_compromisso(Long id_compromisso) {
		this.id_compromisso = id_compromisso;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
