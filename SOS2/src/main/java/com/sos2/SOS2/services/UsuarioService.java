//classe onde é programada as regras de negócio - lógica do sistema, acessa o UsuarioRepository

package com.sos2.SOS2.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sos2.SOS2.entidade.Usuario;
import com.sos2.SOS2.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	/**
	 * @return todos os usuário cadastrados na base de dados
	 */
	public List<Usuario> retornarTodosUsuarios() {
		return usuarioRepository.findAll();
	}
	
	/**
	 * @param id do usuário
	 * @return o usuário de acordo com o id fornecido
	 */
	public Usuario retornaUsuarioId(Long id_usuario) {
		return usuarioRepository.findById(id_usuario).get();
	}
	
	/**
	 * @param usuario
	 * @return salva todos os dados do usuário, 
	 */
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	/**
	 * @param usuario
	 * deleta o usuário no com o usuário fornecido
	 */
	public void deletaUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
}
