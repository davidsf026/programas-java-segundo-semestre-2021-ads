package apresentacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class PrincipalConcession�ria {
	public static void main(String[] args) {
	//DECLARA��O DE VARI�VEIS
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	Veiculo objVeiculo = null;
	String tipoVeiculo = "";
	
	//ENTRADA DE DADOS
	do {
		try {
			System.out.print("Digite <C> se o ve�culo for um carro ou <M> para moto: ");
			tipoVeiculo = leitor.readLine();
		} catch (IOException erro) {
			System.out.println(erro);
		}
	} while (!tipoVeiculo.equalsIgnoreCase("C") && !tipoVeiculo.equalsIgnoreCase("M"));
		
	if (tipoVeiculo.equalsIgnoreCase("C")) {
		objVeiculo = new Carro();
		
	} else {
		objVeiculo = new Moto();
	}
	
	try {
		System.out.println("");
		
		System.out.print("Informe o modelo do ve�culo: ");
		objVeiculo.setModelo(leitor.readLine());
		
		System.out.print("Informe o fabricante do ve�culo: ");
		objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
		
		System.out.print("Informe a cor do ve�culo: ");
		objVeiculo.setCor(leitor.readLine());
		
		if (tipoVeiculo.equalsIgnoreCase("C")) {
			System.out.print("O ve�culo tem teto solar? <S> para sim ou qualquer outra coisa para n�o: ");
			((Carro) objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("S")); //O (leitor.readLine().equalsIgnoreCase("S")) RETORNA TRUE OU FALSE.
		} else {
			System.out.print("Informe as cilindradas do ve�culo: ");
			((Moto) objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
		}
	} catch (Exception erro) {
		System.out.println(erro);
	}
	
	//SA�DA DE DADOS
	System.out.println("");
	System.out.println("Modelo do ve�culo: " + objVeiculo.getModelo());
	System.out.println("Fabricante do ve�culo: " + objVeiculo.getObjFabricante().getNome());
	System.out.println("Cor do ve�culo: " + objVeiculo.getCor());
	
	if (tipoVeiculo.equalsIgnoreCase("C")) {
		System.out.println("Teto solar: " + (((Carro) objVeiculo).isTetoSolar() ? "SIM" : "N�O")); // COMO VOC� J� SABE O (((Carro) objVeiculo).isTetoSolar() RETORNA TRUE OU FALSE, LOGO SE FOR TRUE ELE EXECUTA O QUE EST� ENTRE "?" E ":" SE FOR FALSE ELE EXECUTA O QUE EST� DEPOIS DE :
	} else {
		System.out.println("Cilindradas: " + ((Moto)objVeiculo).getCilindrada());
	}	
	}
}
