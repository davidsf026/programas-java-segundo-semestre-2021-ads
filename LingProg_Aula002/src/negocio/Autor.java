package negocio;

public class Autor {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	
	//MÉTODOS CONSTRUTORES
	public Autor() {
		
	}
	
	public Autor(String nome) {
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
