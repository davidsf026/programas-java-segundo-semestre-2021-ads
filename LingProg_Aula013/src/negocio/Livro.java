package negocio;

import persistencia.LivroDAO;

public class Livro {
	//PROPRIEDADES DA CLASSE
	private int id = 0;
	private String titulo = "";
	private Autor objAutor = null;
	
	//MÉTODOS CONSTRUTORES DA CLASSE
	public Livro() {
		super();
	}

	public Livro(int id, String titulo, Autor objAutor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.objAutor = objAutor;
	}

	//MÉTODOS GET/SET DA CLASSE
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getObjAutor() {
		return objAutor;
	}

	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}
	
	//MÉTODOS ADICIONAIS DA CLASSE
	public void persistir() throws Exception {
		new LivroDAO().persistir(this);
	}
}
