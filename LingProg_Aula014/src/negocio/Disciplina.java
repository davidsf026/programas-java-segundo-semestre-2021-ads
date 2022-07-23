package negocio;

import java.util.Collection;

import persistencia.DisciplinaDAO;

public class Disciplina {
	//PROPRIEDADES DA CLASSE
	private int id = 0;
	private String nome = "";
	
	public Disciplina() {
		super();
	}
	
	//MÉTODOS CONSTRUTORES DA CLASSE
	public Disciplina(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
	//MÉTODOS DA CLASSE
	public static Collection<Disciplina> getTodos() throws Exception {
		return new DisciplinaDAO().getTodos();
	}
}
