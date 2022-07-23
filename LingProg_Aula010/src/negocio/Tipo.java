package negocio;

import java.util.Collection;
import java.util.LinkedList;

public class Tipo {
	//PROPRIEDADES DA CLASSE
	private String descricao = "";
	
	//MÉTODOS CONSTRUTORES DA CLASSE
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	//MÉTODOS GET/SET DA CLASSE
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//MÉTODOS ADICIONAIS DA CLASSE
	public static Collection<Tipo> getAllTipo() {
		LinkedList<Tipo> retorno = new LinkedList<Tipo>();
		
		retorno.add(new Tipo("Eletrônico"));
		retorno.add(new Tipo("Alimentação"));
		retorno.add(new Tipo("Vestuário"));
		retorno.add(new Tipo("Higiene Pessoal"));
		retorno.add(new Tipo("Livro"));
		
		return retorno;
	}
}
