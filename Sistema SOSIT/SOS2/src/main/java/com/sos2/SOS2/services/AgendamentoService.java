package com.sos2.SOS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sos2.SOS2.entidade.Agendamento;
import com.sos2.SOS2.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
	@Autowired
	AgendamentoRepository agendamentoRepository;
	
	/**
	 * @return todos os agendamentos cadastrados na base de dados
	 */
	public List<Agendamento> retornarTodosAgendamentos() {
		return agendamentoRepository.findAll(); // encontra todos os funcionários
	}
	
	/** 
	 * @param id_agendamento
	 * @return os agendamento de acordo com o id fornecido
	 */
	public Agendamento retornaAgendamentoId(Long id_agendamento) {
		return agendamentoRepository.findById(id_agendamento).get();
	}
	
	/**
	 * @param agendamento
	 * @return salva todos os dados do agendamento, 
	 */
	public Agendamento salvarAgendamento(Agendamento agendamento) {
		return agendamentoRepository.save(agendamento);
	}
	
	public void deletaAgendamento(Agendamento agendamento) {
		agendamentoRepository.delete(agendamento);
	}	
	
}
