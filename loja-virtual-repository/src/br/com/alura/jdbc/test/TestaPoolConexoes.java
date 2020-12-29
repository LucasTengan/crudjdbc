package br.com.alura.jdbc.test;
import java.sql.SQLException;

import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for(int i = 0; i < 20; i++) {
			connectionFactory.recuperarConexa();
			System.out.println("Conexão de número: " + i);
		}
	}
}
