package apresentacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class PrincipalImobiliaria {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		boolean ehNovo = false;
		
		try {
			System.out.print("Digite <N> se o ímovel for novo ou qualquer outra coisa se o imóvel for usado: ");
			if (leitor.readLine().equalsIgnoreCase("N")) {
				objImovel = new Novo();	
				ehNovo = true; //LEVANDO EM CONTA QUE AS CLASSE FILHA NOVO TEM UM MÉTODO SUBESCRTIO DO IMOVEL (getValor), A PARTIR DESSE MOMENTO, QUANDO O getValor FOR CHAMADO, SERÁ EXECUTADO O getValor SUBESCRITO DA CLASSE NOVO E NÃO O getValor DA CLASSE IMOVEL.
			} else {
				objImovel = new Usado(); //LEVANDO EM CONTA QUE AS CLASSE FILHA USADO TEM UM MÉTODO SUBESCRTIO DO IMOVEL (getValor), A PARTIR DESSE MOMENTO, QUANDO O getValor FOR CHAMADO, SERÁ EXECUTADO O getValor SUBESCRITO DA CLASSE USADO E NÃO O getValor DA CLASSE IMOVEL.
			}
		} catch (IOException erro) {
			System.out.println(erro);
		}
		
		//ENTRADA DE DADOS
		try {
			System.out.println("");
			System.out.print("Infome o endereço do imóvel: ");
			objImovel.setEndereco(leitor.readLine());
			
			System.out.print("Infome a metragem do imóvel: ");
			objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Infome o valor do imóvel: ");
			objImovel.setValor(Double.parseDouble(leitor.readLine()));
			
			if (ehNovo) {
				System.out.print("Infome o valor adicional do imóvel: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine())); //MESMO SE NÃO TIVESSE ESSA LINHA, AO CHAMAR O MÉTODO getValor SERIA EXECUTADO O getValor SUBESCRITO DA CLASSE (USADO OU NOVO, DEPENDE O IF LÁ EM CIMA) E NÃO O getValor DA CLASSE IMOVEL.
			} else {
				System.out.print("Infome o valor de depreciação do imóvel: ");
				((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine())); //MESMO SE NÃO TIVESSE ESSA LINHA, AO CHAMAR O MÉTODO getValor SERIA EXECUTADO O getValor SUBESCRITO DA CLASSE (USADO OU NOVO, DEPENDE O IF LÁ EM CIMA) E NÃO O getValor DA CLASSE IMOVEL.
			}					
			System.out.println("");
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//SAÍDA DE DADOS
		System.out.println("Endereço do imóvel: " + objImovel.getEndereco());
		System.out.println("A metragem do imóvel: " + objImovel.getMetragem());
		System.out.println("Valor do imóvel: " + objImovel.getValor());
	}
}
