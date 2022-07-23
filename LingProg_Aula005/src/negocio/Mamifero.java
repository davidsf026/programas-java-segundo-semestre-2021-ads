package negocio;

public abstract class Mamifero extends Animal{ //ABSTRACT SIGINIFICA QUE ELA N�O PODE SER INSTANCIADA, � APENAS UMA ORGANIZADORA POIS N�O REPRESENTA UM OBJETO DO MUNDO REAL
	//PROPRIEDADES DA CLASSE
	private double litrosDeLeite = 0;
	
	//M�TODO CONSTRUTOR
	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, double litrosDeLeite) {
		super(peso, altura, nome);
		this.litrosDeLeite = litrosDeLeite;
	}
	
	//M�TODO GET/SET
	public double getLitrosDeLeite() {
		return litrosDeLeite;
	}

	public void setLitrosDeLeite(double litrosDeLeite) {
		this.litrosDeLeite = litrosDeLeite;
	}	
}
