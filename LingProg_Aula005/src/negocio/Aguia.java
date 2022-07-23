package negocio;

public class Aguia extends Ave{
	//PROPRIEDADES DA CLASSE
	private int horasDeAutonomia = 0;
	
	//MÉTODO CONSTRUTOR
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, int quantidadeDeOvos, int horasDeAutonomia) {
		super(peso, altura, nome, quantidadeDeOvos);
		this.horasDeAutonomia = horasDeAutonomia;
	}

	//MÉTODO GET/SET
	public int getHorasDeAutonomia() {
		return horasDeAutonomia;
	}

	public void setHorasDeAutonomia(int horasDeAutonomia) {
		this.horasDeAutonomia = horasDeAutonomia;
	}
	
	//MÉTODOS ADICIONAIS
	public String voar() {
		return "Vooosh! *A águia voou*";
	}
}
