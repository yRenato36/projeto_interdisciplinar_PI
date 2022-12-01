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

import com.sos2.SOS2.dto.FuncionarioDto;
import com.sos2.SOS2.entidade.Empresa;
import com.sos2.SOS2.entidade.Funcionario;
import com.sos2.SOS2.services.EmpresaService;
import com.sos2.SOS2.services.FuncionarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {
	@Autowired
	FuncionarioService funcionarioService;
	@Autowired
	EmpresaService empresaService;
	
	/**
	 * 
	 * @param recebe como parametro um objeto funcionarioDto
	 * @return metodo responsavel por casdastrar um funcionario da base de dados de acordo com a informacoes que foram recebidas no objeto empresa
	 * 
	 */
	@PostMapping //verbo post
	public ResponseEntity<Funcionario> cadastrarFuncionario(@RequestBody FuncionarioDto funcionarioDto) {
		Funcionario funcionario = new Funcionario();
		BeanUtils.copyProperties(funcionarioDto, funcionario);
		Empresa empresa = empresaService.retornaEmpresaId(funcionarioDto.getId_empresa());
		funcionario.setEmpresa(empresa);
		return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.salvarFuncionario(funcionario));
	}
	
	/**
	 * @param recebe como parametro um id que corresponde ao id de um funcionario da base
	 * @return metodo responsavel por buscar na base de dados apenas um funcionario de acordo com o id fornecido
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> retornarFuncionarioId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.retornaFuncionarioId(id));
	}
	/**
	 * @param recebe como parametro um id que corresponde ao id de um funcionario da base
	 * @return metodo responsavel por deletar da base de dados apenas um funcionario de acordo com o id fornecido
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deletaFuncionario(@PathVariable Long id) {
		Funcionario funcionario = funcionarioService.retornaFuncionarioId(id);
		funcionarioService.deletaFuncionario(funcionario);
		return ResponseEntity.status(HttpStatus.OK).body("funcionario deletado");
	}
}