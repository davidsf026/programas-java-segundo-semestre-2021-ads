package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class PrincipalAmazon {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Compra objCompra = new Compra();
		Produto objProduto = new Produto();
		Tipo objTipo = new Tipo();
		
		//ENTRADA DE DADOS
		try {
			//INFORMEI NOME DO PRODUTO
			System.out.print("Informe o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			//INFORMEI DESCRIÇÃO DO PRODUTO
			System.out.print("Informe a descrição do produto: ");
			objTipo.setDescricacao(leitor.readLine());
			
			//COLOQUEI O "objTipo" DENTRO DO "objProduto"
			objProduto.setObjTipo(objTipo);
			
			//INFORMEI PREÇO DO PRODUTO
			System.out.print("Informe o preço do produto: ");
			objProduto.setPreco(Double.parseDouble(leitor.readLine()));
			
			//COLOQUEI O "objProduto" DENTRO DO "objCompra" 
			objCompra.setObjProduto(objProduto);
			
			//INFORMEI A QUANTIDADE DE PRODUTOS
			System.out.print("Informe a quantidade de produtos: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
			
			//INFORME A DATA DA COMPRA
			System.out.print("Informe a data da compra: ");
			objCompra.setDataParaApresentacao(leitor.readLine());
			
			//INFORMEI O CARTÃO
			System.out.print("Informe o número do seu cartão: ");
			objCompra.setCartao(leitor.readLine());
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		//SAÍDA DE DADOS
		System.out.println("");
		
		System.out.println("Nome do produto: " + objCompra.getObjProduto().getNome());
		
		System.out.println("Descrição do tipo do produto: " + objCompra.getObjProduto().getObjTipo().getDescricacao());
		
		System.out.println("Preço do produto: " + objCompra.getObjProduto().getPreco());
		
		System.out.println("Quantidade de produtos: " + objCompra.getQuantidade());
		
		System.out.println("Valor total: " + (objCompra.getObjProduto().getPreco() * objCompra.getQuantidade()));
		
		System.out.println("Data da compra (Tela): " + objCompra.getDataParaApresentacao());
		System.out.println("Data da compra (DB Date Print Test): " + objCompra.getDataParaPersistencia());
		
		System.out.println("Número do Cartão: " + objCompra.getCartao());
	}
}

