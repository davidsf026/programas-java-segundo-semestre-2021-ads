package negocio;

public class Carro extends Veiculo{
	//PROPRIEDADES DA CLASSE
	private boolean tetoSolar;
	
	//M�TODO CONSTRUTOR
	public Carro() {
		super();
	}

	public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetoSolar) {
		super(modelo, objFabricante, cor);
		this.tetoSolar = tetoSolar;
	}

	
	//M�TODO GET/SET
	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
}
