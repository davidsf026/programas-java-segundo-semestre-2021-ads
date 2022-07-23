package negocio;

public class Usado extends Imovel{
	//PROPRIEDADES DA CLASSE
	private double depreciacao = 0;
	
	//MÉTODO CONSTRUTOR
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}
	
	//MÉTODO GET/SET
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	//MÉTODOS SOBESCRITOS DA CLASSE
	public double getValor() {
		double retorno = 0;
		
		retorno = super.getValor() - this.depreciacao;
		
		return retorno;		
	}
}
