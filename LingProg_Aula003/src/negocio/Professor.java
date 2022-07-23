package negocio;

public class Professor {
	//PROPRIEDADES DA CLASSE
	private String nome = "";
	private String titulo = "";
	private double salario = 0;
	
	//MÉTODO CONSTRUTOR
	public Professor() {
		
	}

	public Professor(String nome, String titulo, double salario) {
		this.nome = nome;
		this.titulo = titulo;
		this.salario = salario;
	}
	
	//MÉTODO GET/SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
