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

import com.sos2.SOS2.dto.CompromissoDto;
import com.sos2.SOS2.entidade.Agendamento;
import com.sos2.SOS2.entidade.Compromisso;
import com.sos2.SOS2.entidade.Usuario;
import com.sos2.SOS2.services.AgendamentoService;
import com.sos2.SOS2.services.CompromissoService;
import com.sos2.SOS2.services.UsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Compromisso")
public class CompromissoController {
	@Autowired
	CompromissoService compromissoService;
	@Autowired
	AgendamentoService agendamentoService;
	@Autowired
	UsuarioService usuarioService;
	
	/**
	 * @param recebe o objeto compromissoDto como parametro
	 * @return metodo responsavel por cadastrar um compromisso na base de dados, é copiados todos os atributos que foram passados em CompormissoDto, entao inseridos no objeto compromisso
	 */
	@PostMapping // verbo post
	public ResponseEntity<Compromisso> cadastrarCompromisso(@RequestBody CompromissoDto compromissoDto) {
		Compromisso compromisso = new Compromisso();
		BeanUtils.copyProperties(compromissoDto, compromisso);
		Agendamento agendamento = agendamentoService.retornaAgendamentoId(compromissoDto.getId_agendamento());
		Usuario usuario = usuarioService.retornaUsuarioId(compromissoDto.getId_usuario());
		compromisso.setUsuario(usuario);
		compromisso.setAgendamento(agendamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(compromissoService.salvarCompromisso(compromisso));
	}
	
	/**
	 * @return metodo responsavel por buscar na base de dados todos os compromissos que foram registrados 
	 */
	@GetMapping
	public ResponseEntity<List<Compromisso>> retornarTodosCompromissos() {
		List<Compromisso> compromisso = compromissoService.retornarTodosCompromissos();
		return ResponseEntity.status(HttpStatus.OK).body(compromisso);
	}
	
	/**
	 * @param recebe como parametro um id que corresponde ao id de um unico compromisso 
	 * @return metodo responsavel por buscar apenas um compromisso de acordo com o id que foi fornecido
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Compromisso> retornarCompromissoId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(compromissoService.retornaCompromissoId(id));
	}
	
	/**
	 * @param recebe como parametro um id que corresponde ao id de um unico compromisso 
	 * @return metodo responsavel por deletar um compromisso no id que foi fornecido
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deletaCompromisso(@PathVariable Long id) {
		Compromisso compromisso = compromissoService.retornaCompromissoId(id);
		compromissoService.deletaCompromisso(compromisso);
		return ResponseEntity.status(HttpStatus.OK).body("Compromisso deletado");
	}

}
