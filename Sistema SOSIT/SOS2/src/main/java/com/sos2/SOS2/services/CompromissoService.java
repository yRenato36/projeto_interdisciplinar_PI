package com.sos2.SOS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sos2.SOS2.entidade.Compromisso;
import com.sos2.SOS2.repositories.CompromissoRepository;

@Service
public class CompromissoService {

	@Autowired
	CompromissoRepository compromissoRepository;

	/**
	 * @return todos os Compromisso cadastrados na base de dados
	 */
	public List<Compromisso> retornarTodosCompromissos() {
		return compromissoRepository.findAll(); // encontra todos os funcionários
	}

	/**
	 * @param id_compromisso
	 * @return os compromisso de acordo com o id fornecido
	 */
	public Compromisso retornaCompromissoId(Long id_compromisso) {
		return compromissoRepository.findById(id_compromisso).get();
	}

	/**
	 * @param compromisso
	 * @return salva todos os dados do compromisso,
	 */
	public Compromisso salvarCompromisso(Compromisso compromisso) {
		return compromissoRepository.save(compromisso);
	}

	public void deletaCompromisso(Compromisso compromisso) {
		compromissoRepository.delete(compromisso);
	}

}
