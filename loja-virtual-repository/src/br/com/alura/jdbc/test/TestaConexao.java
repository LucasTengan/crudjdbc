package br.com.alura.jdbc.test;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexa();
		
		System.out.println("Fechando conexao");
		
		connection.close();
	}
}