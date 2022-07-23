package apresentacao;

import negocio.Pessoa;

public class Principal {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Pessoa objeto1 = new Pessoa();
		Pessoa objeto2 = new Pessoa();
		
		//ENTRADA DE DADOS
		objeto1.setNome("Junior");
		objeto1.setEndereco("SHIS Qi 3");
		objeto1.setTelefone("99995");
		
		objeto2.setNome("David");
		objeto2.setEndereco("Sobradisney");
		objeto2.setTelefone("(61)00000-0000");
		
		//SAÍDA DE DADOS
		System.out.println("O nome da pessoa 1 é: " + objeto1.getNome());
		System.out.println("O endereço da pessoa 1 é: " + objeto1.getEndereco());
		System.out.println("O telefone da pessoa 1 é: " + objeto1.getTelefone());
		
		System.out.println("");
		
		System.out.println("O nome da pessoa 2 é: " + objeto2.getNome());
		System.out.println("O endereço da pessoa 2 é: " + objeto2.getEndereco());
		System.out.println("O telefone da pessoa 2 é: " + objeto2.getTelefone());
	}
}
