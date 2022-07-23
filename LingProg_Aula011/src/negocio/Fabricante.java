package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Fabricante {
	// PROPRIEDADES DA CLASSE
	private String nome = "";

	// MÉTODOS CONSTRUTORES DA CLASSE
	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	// MÉTODO GET/SET DA CLASSE
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// MÉTODO ADICIONAIS DA CLASSE
	public static Collection<Fabricante> getAllFabricante() {
		ArrayList<Fabricante> retorno = new ArrayList<Fabricante>();

		retorno.add(new Fabricante("Honda"));
		retorno.add(new Fabricante("Volkswagen"));
		retorno.add(new Fabricante("Toyota"));
		retorno.add(new Fabricante("Hyundai"));
		retorno.add(new Fabricante("Ferrari"));
		retorno.add(new Fabricante("Peugeot"));
		retorno.add(new Fabricante("Lamborguini"));
		retorno.add(new Fabricante("Fiat"));
		retorno.add(new Fabricante("Chevrolet"));
		retorno.add(new Fabricante("Ford"));
		retorno.add(new Fabricante("Nissan"));
		retorno.add(new Fabricante("BMW"));
		
		return retorno;
	}
}
