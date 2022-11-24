package com.sos2.SOS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sos2.SOS2.entidade.Empresa;
import com.sos2.SOS2.repositories.EmpresaRepository;

@Service
public class EmpresaService {
	@Autowired
	EmpresaRepository empresaRepository;
	
	public List<Empresa> retornarTodasEmpresas() {
		return empresaRepository.findAll();
	}
	
	public Empresa retornaEmpresaId(Long id_empresa) {
		return empresaRepository.findById(id_empresa).get();
	}
	
	public Empresa salvarEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	public void deletaEmpresa(Empresa empresa) {
		empresaRepository.delete(empresa);
	}
}
