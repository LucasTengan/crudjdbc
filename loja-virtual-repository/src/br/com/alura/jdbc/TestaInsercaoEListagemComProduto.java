package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto("C�moda", "C�moda Vertical");
		
		try (Connection connection = new ConnectionFactory().recuperarConexa()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);
			produtoDAO.salvar(produto);
			List<Produto> listaDeProdutos = produtoDAO.listar();
			listaDeProdutos.stream().forEach(System.out::println);
		}
	}
}
