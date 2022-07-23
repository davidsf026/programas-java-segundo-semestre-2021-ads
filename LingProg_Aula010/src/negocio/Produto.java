package negocio;

public class Produto {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	private double preco = 0;
	private Tipo objTipo = null;
	private boolean perecivel = false;
	private String detalhamento = "";
	
	//MÉTODOS CONSTRUTORES DA CLASSE
	public Produto() {
		super();
	}


	public Produto(String nome, double preco, Tipo objTipo, boolean perecivel, String detalhamento) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.objTipo = objTipo;
		this.perecivel = perecivel;
		this.detalhamento = detalhamento;
	}
	
	//MÉTODOS GET/SET DA CLASSE
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Tipo getObjTipo() {
		return objTipo;
	}


	public void setObjTipo(Tipo objTipo) {
		this.objTipo = objTipo;
	}


	public boolean isPerecivel() {
		return perecivel;
	}


	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}


	public String getDetalhamento() {
		return detalhamento;
	}


	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}
}
