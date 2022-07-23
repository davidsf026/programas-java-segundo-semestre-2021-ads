package negocio;

import java.util.Collection;

import persistencia.ProfessorDAO;

public class Professor {
	//PROPRIEDADES DA CLASSE
	private int id = 0;
	private String nome = "";
	private String titulacao = "";
	
	//MÉTODOS CONSTRUTORES DA CLASSE
	public Professor() {
		super();
	}

	public Professor(int id, String nome, String titulacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.titulacao = titulacao;
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

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	//MÉTODOS DA CLASSE
	public static Collection<Professor> getTodos() throws Exception {
		return new ProfessorDAO().getTodos();
	}
}
