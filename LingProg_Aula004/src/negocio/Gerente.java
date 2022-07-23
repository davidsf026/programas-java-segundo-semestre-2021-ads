package negocio;

public class Gerente extends Colaborador{
	//PROPRIEDADES DA CLASSE
	private double bonus = 0;
	
	//M�TODO CONSTRUTOR
	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}

	//M�TODO GET/SET
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//M�TODOS SOBESCRITOS DA CLASSE
	public double getSalario() {
		double retorno = 0;

		retorno = (super.getSalario() + (super.getSalario() * this.bonus));
		
		return retorno;
	}
}
