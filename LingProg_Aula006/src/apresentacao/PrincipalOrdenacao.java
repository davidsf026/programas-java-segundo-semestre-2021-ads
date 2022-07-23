package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.BubbleSort;
import negocio.Direta;
import negocio.Inversa;
import negocio.Ordenacao;

public class PrincipalOrdenacao {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		int[] vetor = new int[5];
		
		int escolhaDeMetodoDeOrdenacao = 0;
		
		Ordenacao objOrdenacao = null;
		
		//ENTRADA DE DADOS
		
		System.out.print("Método de ordenação, <1> para bubblesort, <2> para direta e <3> para inversa: ");
		try {
			escolhaDeMetodoDeOrdenacao = Integer.parseInt(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		System.out.println("");
		
		switch (escolhaDeMetodoDeOrdenacao) {
		case 1:
			objOrdenacao = new BubbleSort();
			break;
		case 2:
			objOrdenacao = new Direta();
			break;
		case 3:
			objOrdenacao = new Inversa();
			break;
		}
		
		try {
			for (int i = 0 ; i < vetor.length; i++) {
				System.out.print("Digite o valor da posição " + i + " do vetor: ");
				vetor [i] = Integer.parseInt(leitor.readLine());
			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		objOrdenacao.ordenar(vetor);
		
		//SAÍDA DE DADOS
		System.out.println("");
		for (int i = 0 ; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if (i == 3) {
				System.out.print(" e ");
			} if (i < 3) {
				System.out.print(", ");
			}
		}		
	}
}
