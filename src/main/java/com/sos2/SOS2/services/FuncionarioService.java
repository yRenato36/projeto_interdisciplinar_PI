package com.sos2.SOS2.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sos2.SOS2.entidade.Funcionario;
import com.sos2.SOS2.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	/**
	 * @return todos os funcionários cadastrados na base de dados
	 */
	public List<Funcionario> retornarTodosFuncionarios() {
		return funcionarioRepository.findAll(); // encontra todos os funcionários
	}
	
	/** 
	 * @param id_funcionario
	 * @return o funcionário de acordo com o id fornecido
	 */
	public Funcionario retornaFuncionarioId(Long id_funcionario) {
		return funcionarioRepository.findById(id_funcionario).get();
	}
	
	/**
	 * @param funcionario
	 * @return salva todos os dados do funcionário, 
	 */
	public Funcionario salvarFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	public void deletaFuncionario(Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}	
	
}
