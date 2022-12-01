package com.sos2.SOS2.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sos2.SOS2.entidade.Agenda;
import com.sos2.SOS2.entidade.Agendamento;
import com.sos2.SOS2.services.AgendaService;
import com.sos2.SOS2.services.AgendamentoService;
import com.sos2.SOS2.dto.AgendamentoDto;

@CrossOrigin("*")
@RestController
@RequestMapping("/Agendamento")
public class AgendamentoController {
	@Autowired
	AgendamentoService agendamentoService;
	@Autowired
	AgendaService agendaService;
	
	/**
	 * @param recebe como paramentro o objeto agendamentoDto
	 * @return metodo responsavel por registrar na base de dados um agendamento, onde os atributos de agenda sao introduzidos no objeto agendamento 
	 */
	@PostMapping //verbo post
	public ResponseEntity<Agendamento> cadastrarAgendamento(@RequestBody AgendamentoDto agendamentoDto) {
		Agendamento agendamento = new Agendamento();
		BeanUtils.copyProperties(agendamentoDto, agendamento);
		Agenda agenda = agendaService.retornaAgendaId(agendamentoDto.getId_agenda());
		agendamento.setAgenda(agenda);
		return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.salvarAgendamento(agendamento));
	}
	
	/**
	 * @return metodo responsavel por buscar todos os agendamentos que foram registrados na base de dados
	 */
	@GetMapping
	public ResponseEntity<List<Agendamento>> retornarTodosAgendamento() {
		List<Agendamento> agendamento = agendamentoService.retornarTodosAgendamentos();
		return ResponseEntity.status(HttpStatus.OK).body(agendamento);
	}
	
	/**
	 * @param recebe um id que corresponde ao id de um agendamento
	 * @return metodo responsavel por buscar apenas um agendamento da base de dados
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Agendamento> retornarAgendamentoId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.retornaAgendamentoId(id));
	}
	
	/**
	 * @param recebe um id que corresponde ao id de um agendamento
	 * @return metodo responsavel por deletar um agendamento da base de dados de acordo com  o id que foi fornecido
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deletaAgendamento(@PathVariable Long id) {
		Agendamento agendamento = agendamentoService.retornaAgendamentoId(id);
		agendamentoService.deletaAgendamento(agendamento);
		return ResponseEntity.status(HttpStatus.OK).body("Agendamento deletado");
	}
	
}
