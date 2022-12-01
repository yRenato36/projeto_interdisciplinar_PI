package com.sos2.SOS2.dto;

public class AgendamentoDto {
	String dia_semana;
	int horario_inicio;
	int horario_fim;
	Long id_agenda;
	
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
	public Long getId_agenda() {
		return id_agenda;
	}
	public void setId_agenda(Long id_agenda) {
		this.id_agenda = id_agenda;
	}
	
}
