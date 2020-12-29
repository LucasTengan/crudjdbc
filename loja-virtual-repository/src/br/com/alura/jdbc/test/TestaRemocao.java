package br.com.alura.jdbc.test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexa();
	
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 1);
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
	
		System.out.println("Qtd linhas modificadas: " + linhasModificadas);
	}
	
}
