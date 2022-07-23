package negocio;

public class Pessoa {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	
	//M�TODOS CONSTRUTORES
	public Pessoa() { //M�TODO CONSTRUTOR VAZIO
		
	}
	public Pessoa(String nome, String endereco, String telefone) { //M�TODO CONSTRUTOR CHEIO
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//M�TODOS GET/SET
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
