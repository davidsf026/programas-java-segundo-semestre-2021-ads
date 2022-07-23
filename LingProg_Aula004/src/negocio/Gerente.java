package negocio;

public class Gerente extends Colaborador{
	//PROPRIEDADES DA CLASSE
	private double bonus = 0;
	
	//MÉTODO CONSTRUTOR
	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}

	//MÉTODO GET/SET
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//MÉTODOS SOBESCRITOS DA CLASSE
	public double getSalario() {
		double retorno = 0;

		retorno = (super.getSalario() + (super.getSalario() * this.bonus));
		
		return retorno;
	}
}
