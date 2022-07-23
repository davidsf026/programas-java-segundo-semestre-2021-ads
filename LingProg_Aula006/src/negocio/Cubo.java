package negocio;

public class Cubo implements Solido{
	//DECLARAÇÃO DE VARIÁVEIS
	private double aresta = 0;
	
	//MÉTODO CONSTRUTOR
	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}
	
	//MÉTODO GET/SET
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	//MÉTODOS ADICIONAIS
	public double calcularArea() {
		double retorno = 0;
		
		retorno = 6 * Math.pow(this.aresta, 2);
		
		return retorno;		
	}
	
	public double calcularVolume() {
		double retorno = 0;
		
		retorno =  Math.pow(this.aresta, 3);
		
		return retorno;
	}	
}
