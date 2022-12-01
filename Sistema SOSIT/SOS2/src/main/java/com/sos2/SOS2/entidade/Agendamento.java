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
public class Agendamento implements Serializable{
	private static final Long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_agendamento;
	String dia_semana;
	int horario_inicio;
	int horario_fim;
	
	@ManyToOne
	@JoinColumn(name = "id_agenda")
	Agenda agenda;
	
	@JsonIgnore
	@OneToMany(mappedBy = "agendamento")
	List<Compromisso> compromissos = new ArrayList();
	
	public Agendamento() {
	
	}
	
	public Agendamento(Long id_agendamento, String dia_semana, int horario_inicio, int horario_fim, Agenda agenda) {
		this.id_agendamento = id_agendamento;
		this.dia_semana = dia_semana;
		this.horario_inicio = horario_inicio;
		this.horario_fim = horario_fim;
		this.agenda = agenda;
	}
	
		
	public List<Compromisso> getCompromissos() {
		return compromissos;
	}

	public void setCompromissos(List<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Long getId_agendamento() {
		return id_agendamento;
	}
	public void setId_agendamento(Long id_agendamento) {
		this.id_agendamento = id_agendamento;
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

	@Override
	public int hashCode() {
		return Objects.hash(agenda, compromissos, dia_semana, horario_fim, horario_inicio, id_agendamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(agenda, other.agenda) && Objects.equals(compromissos, other.compromissos)
				&& Objects.equals(dia_semana, other.dia_semana) && horario_fim == other.horario_fim
				&& horario_inicio == other.horario_inicio && Objects.equals(id_agendamento, other.id_agendamento);
	}
	
}
