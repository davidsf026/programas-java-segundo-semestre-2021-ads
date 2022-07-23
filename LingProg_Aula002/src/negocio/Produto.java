package negocio;

public class Produto {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	private Estante objEstante = null;
	private int quantidade = 0;
	
	//MÉTODOS CONSTRUTORES
	public Produto() {
		
	}
	
	public Produto(String nome, Estante objEstante, int quantdade) {
		this.nome = nome;
		this.objEstante = objEstante;
		this.quantidade =  quantdade;
	}
	
	//MÉTODO GET/SET
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Estante getObjEstante() {
		return objEstante;
	}
	
	public void setObjEstante(Estante objEstante) {
		this.objEstante = objEstante;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
