package negocio;

public class Veiculo {
	//PROPRIEDADES DA CLASSE
	private Fabricante objFabricante = null;
	private String modelo = "";
	private String cor = "";
	private boolean tetoSolar = false;
	
	//MÉTODOS CONSTRUTORES DA CLASSE
	public Veiculo() {
		super();
	}

	public Veiculo(Fabricante objFabricante, String modelo, String cor, boolean tetoSolar) {
		super();
		this.objFabricante = objFabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.tetoSolar = tetoSolar;
	}
	
	//MÉTODO GET/SET DA CLASSE
	public Fabricante getObjFabricante() {
		return objFabricante;
	}

	public void setObjFabricante(Fabricante objFabricante) {
		this.objFabricante = objFabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
}
