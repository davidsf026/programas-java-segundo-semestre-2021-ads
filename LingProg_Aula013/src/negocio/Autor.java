package negocio;

import java.util.Collection;

import persistencia.AutorDAO;

public class Autor {
	//PROPRIEDADES DA CLASSE
	private int id = 0;
	private String nome = "";
	
	//M�TODOS CONSTRUTORES
	public Autor() {
		super();
	}
	public Autor(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//M�TODOS GET/SET DA CLASSE
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
	
	//M�TODOS ADICIONAIS DA CLASSE
	public static Collection<Autor> getTodos() throws Exception {
		return new AutorDAO().getTodos();
	}
}
