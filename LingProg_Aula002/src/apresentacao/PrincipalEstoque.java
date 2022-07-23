package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class PrincipalEstoque {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
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
			System.out.print("Digite o n�mero da estante do produto: ");
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
		
		//SA�DA DE DADOS
		System.out.println("O nome do produto �: " + objProduto.getNome());
		
		System.out.println("O numero da estante do produto �: " + objProduto.getObjEstante().getNumero());
		
		System.out.println("A quantidade do produto �: " + objProduto.getQuantidade());
	}
}
