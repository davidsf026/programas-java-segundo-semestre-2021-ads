package negocio;

public class Estante {
	//PROPRIEDADES DA CLASSE
	private int numero = 0;
	
	//MÉTODOS CONSTRUTORES
	public Estante() {
		
	}
	
	public Estante(int numero) {
		this.numero = numero;
	}
	
	//MÉTODOS GET/SET
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
