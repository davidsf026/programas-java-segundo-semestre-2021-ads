package negocio;

public class Aguia extends Ave{
	//PROPRIEDADES DA CLASSE
	private int horasDeAutonomia = 0;
	
	//M�TODO CONSTRUTOR
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, int quantidadeDeOvos, int horasDeAutonomia) {
		super(peso, altura, nome, quantidadeDeOvos);
		this.horasDeAutonomia = horasDeAutonomia;
	}

	//M�TODO GET/SET
	public int getHorasDeAutonomia() {
		return horasDeAutonomia;
	}

	public void setHorasDeAutonomia(int horasDeAutonomia) {
		this.horasDeAutonomia = horasDeAutonomia;
	}
	
	//M�TODOS ADICIONAIS
	public String voar() {
		return "Vooosh! *A �guia voou*";
	}
}
