package negocio;

public abstract class Ave extends Animal{ //ABSTRACT SIGINIFICA QUE ELA NÃO PODE SER INSTANCIADA, É APENAS UMA ORGANIZADORA POIS NÃO REPRESENTA UM OBJETO DO MUNDO REAL
	//PROPRIEDADES DA CLASSE
	private int quantidadeDeOvos = 0;
	
	//MÉTODO CONSTRUTOR
	public Ave() {
		super();
	}

	public Ave(double peso, double altura, String nome, int quantidadeDeOvos) {
		super(peso, altura, nome);
		this.quantidadeDeOvos = quantidadeDeOvos;
	}
	
	//MÉTODO GET/SET
	public int getQuantidadeDeOvos() {
		return quantidadeDeOvos;
	}

	public void setQuantidadeDeOvos(int quantidadeDeOvos) {
		this.quantidadeDeOvos = quantidadeDeOvos;
	}
	
	
}
