package negocio;

public abstract class Mamifero extends Animal{ //ABSTRACT SIGINIFICA QUE ELA NÃO PODE SER INSTANCIADA, É APENAS UMA ORGANIZADORA POIS NÃO REPRESENTA UM OBJETO DO MUNDO REAL
	//PROPRIEDADES DA CLASSE
	private double litrosDeLeite = 0;
	
	//MÉTODO CONSTRUTOR
	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, double litrosDeLeite) {
		super(peso, altura, nome);
		this.litrosDeLeite = litrosDeLeite;
	}
	
	//MÉTODO GET/SET
	public double getLitrosDeLeite() {
		return litrosDeLeite;
	}

	public void setLitrosDeLeite(double litrosDeLeite) {
		this.litrosDeLeite = litrosDeLeite;
	}	
}
