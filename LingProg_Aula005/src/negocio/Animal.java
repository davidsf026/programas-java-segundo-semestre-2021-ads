package negocio;

public abstract class Animal { //ABSTRACT SIGINIFICA QUE ELA N�O PODE SER INSTANCIADA, � APENAS UMA ORGANIZADORA POIS N�O REPRESENTA UM OBJETO DO MUNDO REAL
	//PROPRIEDADES DA CLASSE
	private double peso = 0;
	private double altura = 0;
	private String nome = "";
	
	//M�TODO CONSTRUTOR
	public Animal() {
		super();
	}

	public Animal(double peso, double altura, String nome) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.nome = nome;
	}
	
	//M�TODO GET/SET
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//M�TODOS ADICIONAIS
	public double calcularIMC() {
		double retorno = 0;
		
		retorno = this.peso / Math.pow(this.altura, 2);
		
		return retorno;
	}
}
