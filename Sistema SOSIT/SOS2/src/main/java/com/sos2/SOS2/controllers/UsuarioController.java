//recebe as requisições do usuário

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

import com.sos2.SOS2.entidade.Usuario;
import com.sos2.SOS2.services.UsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	/**
	 * @param recebe um objeto usuario como parametro
	 * @return metodo responsavel por registrar os usuario no banco
	 */
	@PostMapping //verbo post
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvarUsuario(usuario));
	}
	
	/**
	 * @return metodo responsavel por registrar varios usuarios no banco 
	 */
	@GetMapping //verbo get
	public ResponseEntity<List<Usuario>> retornarTodosUsuarios() {
		List<Usuario> usuario = usuarioService.retornarTodosUsuarios();
		return ResponseEntity.status(HttpStatus.OK).body(usuario);
	}
	
	/**
	 * @param recebe um id de um usuario 
	 * @return metodo responsavel por registrar um usuario no banco utilizando o id do usuario fornecido
	 */ 
	@GetMapping("/{id}") //verbo get fornecendo um id
	public ResponseEntity<Usuario> retornarUsuarioId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.retornaUsuarioId(id));
	}
	
	/**
	 * @param recebe um id de um usuario como parametro
	 * @return metodo reponsavel por deletar um usuario da base de dados de acordo com o id fornecido
	 *  
	 */
	@DeleteMapping("/{id}") //verbo delete fornecendo um id
	public ResponseEntity<Object> deletaUsuario(@PathVariable Long id) {
		Usuario usuario = usuarioService.retornaUsuarioId(id);
		usuarioService.deletaUsuario(usuario);
		return ResponseEntity.status(HttpStatus.OK).body("Usuario Deletado");
	}	
}
