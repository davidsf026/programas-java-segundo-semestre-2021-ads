package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class PrincipalGeometriaEspacial {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Solido objSolido = null;
		int tipoDeSolido = 0;
		
		//ENTRADA DE DADOS
		do {
			System.out.print("Digite <0> para cubo e <1> para cilindro: ");
			try {
				tipoDeSolido = Integer.parseInt(leitor.readLine());
			} catch (Exception erro) {
				System.out.println(erro);
			}			
		} while (!(tipoDeSolido <= 1));
		
		System.out.println("");
		
		switch (tipoDeSolido + 1) {
		case 1:
			objSolido = new Cubo();
			System.out.print("Informe a aresta do seu cubo: ");
			try {
				((Cubo) objSolido).setAresta(Integer.parseInt(leitor.readLine()));
			} catch (Exception erro) {
				System.out.println(erro);
			}			
			break;
		case 2:
			objSolido = new Cilindro();
			
			try {
				System.out.print("Informe a altura do seu cilindro: ");
				((Cilindro) objSolido).setAltura(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Informe o raio do seu cilindro: ");
				((Cilindro) objSolido).setRaio(Integer.parseInt(leitor.readLine()));				
			} catch (Exception erro) {
				System.out.println(erro);
			}				
			break;
		}
		
		//SAÍDA DE DADOS
		System.out.println("");
		System.out.println("Área do seu sólido: " + objSolido.calcularArea());
		System.out.println("Volume do seu sólido: " + objSolido.calcularVolume());
	}
}
