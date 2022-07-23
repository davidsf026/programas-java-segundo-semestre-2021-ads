package apresentacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class PrincipalImobiliaria {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		boolean ehNovo = false;
		
		try {
			System.out.print("Digite <N> se o �movel for novo ou qualquer outra coisa se o im�vel for usado: ");
			if (leitor.readLine().equalsIgnoreCase("N")) {
				objImovel = new Novo();	
				ehNovo = true; //LEVANDO EM CONTA QUE AS CLASSE FILHA NOVO TEM UM M�TODO SUBESCRTIO DO IMOVEL (getValor), A PARTIR DESSE MOMENTO, QUANDO O getValor FOR CHAMADO, SER� EXECUTADO O getValor SUBESCRITO DA CLASSE NOVO E N�O O getValor DA CLASSE IMOVEL.
			} else {
				objImovel = new Usado(); //LEVANDO EM CONTA QUE AS CLASSE FILHA USADO TEM UM M�TODO SUBESCRTIO DO IMOVEL (getValor), A PARTIR DESSE MOMENTO, QUANDO O getValor FOR CHAMADO, SER� EXECUTADO O getValor SUBESCRITO DA CLASSE USADO E N�O O getValor DA CLASSE IMOVEL.
			}
		} catch (IOException erro) {
			System.out.println(erro);
		}
		
		//ENTRADA DE DADOS
		try {
			System.out.println("");
			System.out.print("Infome o endere�o do im�vel: ");
			objImovel.setEndereco(leitor.readLine());
			
			System.out.print("Infome a metragem do im�vel: ");
			objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Infome o valor do im�vel: ");
			objImovel.setValor(Double.parseDouble(leitor.readLine()));
			
			if (ehNovo) {
				System.out.print("Infome o valor adicional do im�vel: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine())); //MESMO SE N�O TIVESSE ESSA LINHA, AO CHAMAR O M�TODO getValor SERIA EXECUTADO O getValor SUBESCRITO DA CLASSE (USADO OU NOVO, DEPENDE O IF L� EM CIMA) E N�O O getValor DA CLASSE IMOVEL.
			} else {
				System.out.print("Infome o valor de deprecia��o do im�vel: ");
				((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine())); //MESMO SE N�O TIVESSE ESSA LINHA, AO CHAMAR O M�TODO getValor SERIA EXECUTADO O getValor SUBESCRITO DA CLASSE (USADO OU NOVO, DEPENDE O IF L� EM CIMA) E N�O O getValor DA CLASSE IMOVEL.
			}					
			System.out.println("");
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//SA�DA DE DADOS
		System.out.println("Endere�o do im�vel: " + objImovel.getEndereco());
		System.out.println("A metragem do im�vel: " + objImovel.getMetragem());
		System.out.println("Valor do im�vel: " + objImovel.getValor());
	}
}
