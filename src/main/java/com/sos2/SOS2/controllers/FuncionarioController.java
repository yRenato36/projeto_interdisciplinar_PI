package com.sos2.SOS2.controllers;

import java.util.List;

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

import com.sos2.SOS2.entidade.Funcionario;
import com.sos2.SOS2.services.FuncionarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {
	@Autowired
	FuncionarioService funcionarioService;
	
	@PostMapping
	public ResponseEntity<Funcionario> cadastrarFuncionario(@RequestBody Funcionario funcionario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.salvarFuncionario(funcionario));		
	}
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> retornarTodosFuncionarios() {
		List<Funcionario> funcionario = funcionarioService.retornarTodosFuncionarios();
		return ResponseEntity.status(HttpStatus.OK).body(funcionario);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> retornarFuncionarioId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.retornaFuncionarioId(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deletaFuncionario(@PathVariable Long id) {
		Funcionario funcionario = funcionarioService.retornaFuncionarioId(id);
		funcionarioService.deletaFuncionario(funcionario);
		return ResponseEntity.status(HttpStatus.OK).body("funcionario deletado");
	}
}