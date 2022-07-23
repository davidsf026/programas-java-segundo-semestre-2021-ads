package negocio;

public class Cadeira {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	
	//MÉTODO CONSTRUTOR
	public Cadeira() {
		
	}

	public Cadeira(String nome) {
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
