package negocio;

public class Livro {
	//PROPRIEDADES DA CLASSE
	private String titulo = "";
	private Autor objAutor = null;
	private String genero = "";
	
	//MÉTODOS CONSTRUTORES
	public Livro() {
		
	}
	
	public Livro(String titulo, Autor objAutor, String genero) {
		this.titulo = titulo;
		this.objAutor = objAutor;
		this.genero = genero;
	}
	
	//MÉTODOS GET/SET
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
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
