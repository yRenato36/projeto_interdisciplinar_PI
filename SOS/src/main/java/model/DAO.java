package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Data Access Object - DAO
 * Classe responsável pela conexão ao banco de dados
 * @author Renato da Silva Santana 3º ADS
 *
 */
public class DAO {
	//Parâmentros para a String de conexão com o banco de dados
	private String driver = "com.mysql.cj.jdbc.Driver"; //chamando driver que conecta ao BD
	
	//String de conexão - caminho e acessos ao banco
	private String url = "jdbc:mysql://127.0.0.1:3306/bancoagenda?useTimezone=true&serverTimezone=UTC";
	private String usuario = "root";
	private String senha = "123456";
	
	/**
	 * método que faz a conexão direta ao banco de dados
	 * @return retorna a conexão efetuada ou erro e não conecta ao banco
	 */
	private Connection conectar() {
		Connection con = null; //estabelece a conexão
		
		try {
			Class.forName(driver); //lê o driver do banco
			con = DriverManager.getConnection(url, usuario, senha);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//testando conexão
	public void testeconnection() {
		try {
			Connection con = conectar(); //conecta
			System.out.println("Conexao realizada com sucesso" + con);
			con.close(); //fecha a conexão
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
