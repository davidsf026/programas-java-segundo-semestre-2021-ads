package negocio;

public class Cadeira {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	
	//M�TODO CONSTRUTOR
	public Cadeira() {
		
	}

	public Cadeira(String nome) {
		this.nome = nome;
	}
	
	//M�TODO GET/SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
