package negocio;

public class Cachorro extends Mamifero{
	//PROPRIEDADES DA CLASSE
	private double forcaMordida = 0;
	
	//M�TODO CONSTRUTOR
	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, double litrosDeLeite, double forcaMordida) {
		super(peso, altura, nome, litrosDeLeite);
		this.forcaMordida = forcaMordida;
	}
	
	//M�TODO GET/SET
	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	//M�TODO ADICIONAL
	public String morder() {
		return "Nhac! *O cachorro mordeu*";
	}
}
