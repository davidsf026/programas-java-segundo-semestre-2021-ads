package negocio;

public class Moto extends Veiculo{
	//PROPRIEDADES DA CLASSE
	private int cilindrada = 0;

	public Moto() {
		super();
	}

	public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
		super(modelo, objFabricante, cor);
		this.cilindrada = cilindrada;
	}
	
	//MÉTODO GET/SET
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
