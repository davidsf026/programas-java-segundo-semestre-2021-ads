package negocio;

public class Tipo {
	//PROPRIEDADES DA CLASSE
	private String descricacao = "";
	
	//MÉTODOS CONSTRUTORES
	public Tipo() {

	}
	
	public Tipo(String descricacao) {
		this.descricacao = descricacao;
	}
	
	//MÉTODO GET/SET
	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}
}
