package negocio;

public class Ingrediente {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	private int quantidade = 0;
	private String unidade = "";
	
	//M�TODOS CONSTRUTORES
	public Ingrediente() {
		super();
	}

	public Ingrediente(String nome, int quantidade, String unidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.unidade = unidade;
	}
	
	//M�TODOS GET/SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
}
