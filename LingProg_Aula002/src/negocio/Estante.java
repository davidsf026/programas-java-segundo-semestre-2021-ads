package negocio;

public class Estante {
	//PROPRIEDADES DA CLASSE
	private int numero = 0;
	
	//M�TODOS CONSTRUTORES
	public Estante() {
		
	}
	
	public Estante(int numero) {
		this.numero = numero;
	}
	
	//M�TODOS GET/SET
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
