package negocio;

public class Autor {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	
	//M�TODOS CONSTRUTORES
	public Autor() {
		
	}
	
	public Autor(String nome) {
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
