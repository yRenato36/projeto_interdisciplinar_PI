package com.sos2.SOS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sos2.SOS2.entidade.Agenda;
import com.sos2.SOS2.repositories.AgendaRepository;

@Service
public class AgendaService {
	@Autowired
	AgendaRepository agendaRepository;
	
	/**
	 * @return todas as agendas cadastradas na base de dados
	 */
	public List<Agenda> retornarTodasAgendas() {
		return agendaRepository.findAll();
	}

	/**
	 * @param id da agenda
	 * @return a agenda de acordo com o id fornecido
	 */
	public Agenda retornaAgendaId(Long id_agenda) {
		return agendaRepository.findById(id_agenda).get();
	}

	/**
	 * @param agenda
	 * @return salva todas os atributos da agenda.
	 */
	public Agenda salvarAgenda(Agenda agenda) {
		return agendaRepository.save(agenda);
	}

	/**
	 * @param agenda deleta a agenda com a agenda fornecida.
	 */
	public void deletaAgenda(Agenda agenda) {
		agendaRepository.delete(agenda);
	}
}
