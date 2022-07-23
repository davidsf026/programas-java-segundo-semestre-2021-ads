package negocio;

public class Usado extends Imovel{
	//PROPRIEDADES DA CLASSE
	private double depreciacao = 0;
	
	//M�TODO CONSTRUTOR
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}
	
	//M�TODO GET/SET
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	//M�TODOS SOBESCRITOS DA CLASSE
	public double getValor() {
		double retorno = 0;
		
		retorno = super.getValor() - this.depreciacao;
		
		return retorno;		
	}
}
