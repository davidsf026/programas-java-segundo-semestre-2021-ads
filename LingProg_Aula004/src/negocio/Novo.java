package negocio;

public class Novo extends Imovel{
	//PROPRIEDADES DA CLASSE
	private double adicional = 0;
	
	//MÉTODO CONSTRUTOR
	public Novo() {
		super();
	}
	
	public Novo(String endereco, double metragem, double valor, double adicional) {
		super(endereco, metragem, valor);
		this.adicional = adicional;
	}
	
	//MÉTODO GET/SET
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//MÉTODOS SOBESCRITOS DA CLASSE
	public double getValor() {
		double retorno = 0;
		
		retorno =  super.getValor() + getAdicional();
		
		return retorno;		
	}
}
