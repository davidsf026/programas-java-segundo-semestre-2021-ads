package negocio;

public class Cilindro implements Solido{
	//DECLARAÇÃO DE VARIÁVEIS
	private double raio = 0;
	private double altura = 0;
	
	//MÉTODOS CONSTRUTORES
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}
	
	//MÉTODOS GET/SET
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
	
	//MÉTODOS ADICIONAIS
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
