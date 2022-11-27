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
import com.sos2.SOS2.entidade.Empresa;
import com.sos2.SOS2.entidade.Usuario;
import com.sos2.SOS2.services.AgendaService;
import com.sos2.SOS2.services.EmpresaService;
import com.sos2.SOS2.services.UsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Agenda")
public class AgendaController {
	@Autowired
	AgendaService agendaService;
	@Autowired
	EmpresaService empresaService;
	@Autowired
	UsuarioService usuarioService;
	
	/**
	 * @param agenda
	 * @return cadastro de uma única agenda
	 */
	@PostMapping //verbo post
	public ResponseEntity<Agenda> cadastrarAgenda(@RequestBody AgendaDto agendaDto) {
		Agenda agenda = new Agenda();
		BeanUtils.copyProperties(agendaDto, agenda);
		Empresa empresa = new Empresa();
		Usuario usuario = new Usuario();
		empresa = empresaService.retornaEmpresaId(agendaDto.getEmpresa());
		usuario = usuarioService.retornaUsuarioId(agendaDto.getUsuario());
		agenda.setEmpresa(empresa);
		agenda.setUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(agendaService.salvarAgenda(agenda));
	}

	/**
	 * @return todos as agendas da base
	 */
	@GetMapping //verbo get
	public ResponseEntity<List<Agenda>> retornarTodasAgendas() {
		List<Agenda> agenda = agendaService.retornarTodasAgendas();
		return ResponseEntity.status(HttpStatus.OK).body(agenda);
	}
	
	/**
	 * @param id
	 * @return um usuário no id fornecido
	 */
	@GetMapping("/{id}") //verbo get fornecendo um id
	public ResponseEntity<Agenda> retornarAgendaId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(agendaService.retornaAgendaId(id));
	}
	
	/**
	 * @param id
	 * @return deleta um usuário de acordo com o id fornecido
	 */
	@DeleteMapping("/{id}") //verbo delete fornecendo um id
	public ResponseEntity<Object> deletaAgenda(@PathVariable Long id) {
		Agenda agenda = agendaService.retornaAgendaId(id);
		agendaService.deletaAgenda(agenda);
		return ResponseEntity.status(HttpStatus.OK).body("Agenda Deletada");
	}
}
