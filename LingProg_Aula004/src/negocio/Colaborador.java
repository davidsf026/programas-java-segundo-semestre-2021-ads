package negocio;

public class Colaborador {
	//PROPRIEDADES DA CLASSE
	private int matricula = 0;
	private String nome = "";
	private double salario = 0;
	
	//MÉTODO CONSTRUTOR
	public Colaborador() {
		super();
	}

	public Colaborador(int matricula, String nome, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	//MÉTODO GET/SET
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
