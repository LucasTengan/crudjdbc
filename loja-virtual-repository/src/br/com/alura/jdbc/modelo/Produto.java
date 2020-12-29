package br.com.alura.jdbc.modelo;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private Integer categoria_id;
	
	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Produto(Integer id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("O produto é: %d, %s, %s", this.id, this.nome, this.descricao);
	}

	public Integer getCategoriaId() {
		return categoria_id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setCategoriaId(int id) {
		this.id = id;
	}
}
