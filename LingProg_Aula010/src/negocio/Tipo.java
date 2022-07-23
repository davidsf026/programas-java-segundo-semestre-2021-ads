package negocio;

import java.util.Collection;
import java.util.LinkedList;

public class Tipo {
	//PROPRIEDADES DA CLASSE
	private String descricao = "";
	
	//M�TODOS CONSTRUTORES DA CLASSE
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	//M�TODOS GET/SET DA CLASSE
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//M�TODOS ADICIONAIS DA CLASSE
	public static Collection<Tipo> getAllTipo() {
		LinkedList<Tipo> retorno = new LinkedList<Tipo>();
		
		retorno.add(new Tipo("Eletr�nico"));
		retorno.add(new Tipo("Alimenta��o"));
		retorno.add(new Tipo("Vestu�rio"));
		retorno.add(new Tipo("Higiene Pessoal"));
		retorno.add(new Tipo("Livro"));
		
		return retorno;
	}
}
