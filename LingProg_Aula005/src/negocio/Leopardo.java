package negocio;

public class Leopardo extends Mamifero{
	//PROPRIEDADES DA CLASSE
	private double velocidade = 0;
	
	//MÉTODO CONSTRUTOR
	public Leopardo() {
		super();
	}
	
	public Leopardo(double peso, double altura, String nome, double litrosDeLeite, double velocidade) {
		super(peso, altura, nome, litrosDeLeite);
		this.velocidade = velocidade;
	}
	
	//MÉTODO GET/SET
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//MÉTODO ADICIONAIS
	public String correr() {
		return "Vruuuumm... *O leopardo correu*";		
	}
}
