package negocio;

public class Pessoa {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	
	//MÉTODOS CONSTRUTORES
	public Pessoa() { //MÉTODO CONSTRUTOR VAZIO
		
	}
	public Pessoa(String nome, String endereco, String telefone) { //MÉTODO CONSTRUTOR CHEIO
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//MÉTODOS GET/SET
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
