package negocio;

public class Leopardo extends Mamifero{
	//PROPRIEDADES DA CLASSE
	private double velocidade = 0;
	
	//M�TODO CONSTRUTOR
	public Leopardo() {
		super();
	}
	
	public Leopardo(double peso, double altura, String nome, double litrosDeLeite, double velocidade) {
		super(peso, altura, nome, litrosDeLeite);
		this.velocidade = velocidade;
	}
	
	//M�TODO GET/SET
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//M�TODO ADICIONAIS
	public String correr() {
		return "Vruuuumm... *O leopardo correu*";		
	}
}
