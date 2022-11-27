package com.sos2.SOS2.dto;

public class AgendaDto {
	int dia;
	String dia_semana;
	int horario_inicio;
	int horario_fim;
	String servico;
	String protocolo;
	String observacao;
	Long usuario;
	Long empresa;
	
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
	public Long getUsuario() {
		return usuario;
	}
	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}
	public Long getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}
	
	
}
