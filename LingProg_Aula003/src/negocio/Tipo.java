package negocio;

public class Tipo {
	//PROPRIEDADES DA CLASSE
	private String descricacao = "";
	
	//M�TODOS CONSTRUTORES
	public Tipo() {

	}
	
	public Tipo(String descricacao) {
		this.descricacao = descricacao;
	}
	
	//M�TODO GET/SET
	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}
}
