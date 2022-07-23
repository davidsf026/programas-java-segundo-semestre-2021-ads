package negocio;

import java.util.Collection;

import persistencia.ClienteDAO;

public class Cliente {
	//PROPRIEDADES DA CLASSE
	private int id = 0;
	private String nome = "";
	private String cartaoDeCredito = "";
	
	//MÉTODO CONSTRUTORES DA CLASSE
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, String cartaoDeCredito) {
		super();
		this.id = id;
		this.nome = nome;
		this.cartaoDeCredito = cartaoDeCredito;
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

	public String getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(String cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	
	//MÉTODOS DA CLASSE
	public static Collection<Cliente> getTodos() throws Exception {
		return new ClienteDAO().getTodos();
	}
}
