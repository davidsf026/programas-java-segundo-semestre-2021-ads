package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Uf {
	//PROPRIEDADES DA CLASSE
	private String uf = "";
	
	//MÉTODOS CONSTRUTORES DA CLASSE
	public Uf() {
		super();
	}

	public Uf(String uf) {
		super();
		this.uf = uf;
	}
	
	//MÉTODOS GET/SET DA CLASSE
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	//MÉTODOS ADICIONAIS DA CLASSE
	public static Collection<Uf> getAllUf() {
		ArrayList<Uf> retorno = new ArrayList<Uf>();
		
		retorno.add(new Uf("AC"));
		retorno.add(new Uf("AL"));
		retorno.add(new Uf("AP"));
		retorno.add(new Uf("AM"));
		retorno.add(new Uf("BA"));
		retorno.add(new Uf("CE"));
		retorno.add(new Uf("DF"));
		retorno.add(new Uf("ES"));
		retorno.add(new Uf("GO"));
		retorno.add(new Uf("MA"));
		retorno.add(new Uf("MT"));
		retorno.add(new Uf("MS"));
		
		return retorno;
	}
}
