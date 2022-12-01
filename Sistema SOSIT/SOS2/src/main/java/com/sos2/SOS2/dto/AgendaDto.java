package com.sos2.SOS2.dto;

public class AgendaDto {
	int horario_inicio;
	int horario_fim;
	int vagas;
	String dia_agendamento;
	String nome;
	String servico;
	String tipo_servico;
	String descricao_servico;
	Long id_empresa;

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

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getDia_agendamento() {
		return dia_agendamento;
	}

	public void setDia_agendamento(String dia_agendamento) {
		this.dia_agendamento = dia_agendamento;
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

	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

}
