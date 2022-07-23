package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class PrincipalEstoque {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		
		//ENTRADA DE DADOS
		try {
			System.out.print("Digite o nome do produto: ");
			objProduto.setNome(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		try {
			System.out.print("Digite o número da estante do produto: ");
			objProduto.setObjEstante(new Estante(Integer.parseInt(leitor.readLine())));
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		try {
			System.out.print("Digite a quantidade do produto: ");
			objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//SAÍDA DE DADOS
		System.out.println("O nome do produto é: " + objProduto.getNome());
		
		System.out.println("O numero da estante do produto é: " + objProduto.getObjEstante().getNumero());
		
		System.out.println("A quantidade do produto é: " + objProduto.getQuantidade());
	}
}
