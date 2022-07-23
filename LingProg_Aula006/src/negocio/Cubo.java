package negocio;

public class Cubo implements Solido{
	//DECLARA��O DE VARI�VEIS
	private double aresta = 0;
	
	//M�TODO CONSTRUTOR
	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}
	
	//M�TODO GET/SET
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	//M�TODOS ADICIONAIS
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
