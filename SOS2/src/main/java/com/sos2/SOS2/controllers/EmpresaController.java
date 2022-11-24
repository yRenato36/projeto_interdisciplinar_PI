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

import com.sos2.SOS2.entidade.Empresa;
import com.sos2.SOS2.services.EmpresaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Empresa")
public class EmpresaController {
	@Autowired
	EmpresaService empresaService;
	
	@PostMapping //verbo post
	public ResponseEntity<Empresa> cadastrarEmpresa(@RequestBody Empresa empresa) {
		return ResponseEntity.status(HttpStatus.CREATED).body(empresaService.salvarEmpresa(empresa));
	}
	
	@GetMapping //verbo get
	public ResponseEntity<List<Empresa>> retornarTodasEmpresas() {
		List<Empresa> empresa = empresaService.retornarTodasEmpresas();
		return ResponseEntity.status(HttpStatus.OK).body(empresa);
	}
	
	@GetMapping("/{id}") //verbo get fornecendo um id
	public ResponseEntity<Empresa> retornarEmpresaId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(empresaService.retornaEmpresaId(id));
	}
	
	@DeleteMapping("/{id}") //verbo delete fornecendo um id
	public ResponseEntity<Object> deletaEmpresa(@PathVariable Long id) {
		Empresa empresa = empresaService.retornaEmpresaId(id);
		empresaService.deletaEmpresa(empresa);
		return ResponseEntity.status(HttpStatus.OK).body("Empresa Deletada");
	}
	
}
