package negocio;

public class Cilindro implements Solido{
	//DECLARA��O DE VARI�VEIS
	private double raio = 0;
	private double altura = 0;
	
	//M�TODOS CONSTRUTORES
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}
	
	//M�TODOS GET/SET
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//M�TODOS ADICIONAIS
	public double calcularArea() {
		double retorno = 0;
		
		retorno = (Math.PI * Math.pow(this.raio, 2) * 2) + (2 * Math.PI * this.raio) * this.altura;
		
		return retorno;
	}
	
	public double calcularVolume() {
		double retorno = 0;
		
		retorno = Math.PI * Math.pow(this.raio, 2) * this.altura;
		
		return retorno;
	}	
}
