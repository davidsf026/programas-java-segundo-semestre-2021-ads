package negocio;

import java.util.Collection;

import persistencia.ProdutoDAO;

public class Produto {
	//PROPRIEDADES DA CLASSE
	private int id = 0;
	private String nome = "";
	private double preco = 0;
	
	//MÉTODO CONSTRUTORES DA CLASSE
	public Produto() {
		super();
	}

	public Produto(int id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	//MÉTODOS GET/SET DA CLASSE
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//MÉTODOS DA CLASSE
	public static Collection<Produto> getTodos() throws Exception {
		return new ProdutoDAO().getTodos();
	}
}
