package negocio;

public abstract class Ave extends Animal{ //ABSTRACT SIGINIFICA QUE ELA N�O PODE SER INSTANCIADA, � APENAS UMA ORGANIZADORA POIS N�O REPRESENTA UM OBJETO DO MUNDO REAL
	//PROPRIEDADES DA CLASSE
	private int quantidadeDeOvos = 0;
	
	//M�TODO CONSTRUTOR
	public Ave() {
		super();
	}

	public Ave(double peso, double altura, String nome, int quantidadeDeOvos) {
		super(peso, altura, nome);
		this.quantidadeDeOvos = quantidadeDeOvos;
	}
	
	//M�TODO GET/SET
	public int getQuantidadeDeOvos() {
		return quantidadeDeOvos;
	}

	public void setQuantidadeDeOvos(int quantidadeDeOvos) {
		this.quantidadeDeOvos = quantidadeDeOvos;
	}
	
	
}
