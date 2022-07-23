package negocio;

public class Fabricante {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	
	//MÉTODO CONSTRUTOR
	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	
	//MÉTODO GET/SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
