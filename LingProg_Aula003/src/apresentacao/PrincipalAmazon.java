package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class PrincipalAmazon {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Compra objCompra = new Compra();
		Produto objProduto = new Produto();
		Tipo objTipo = new Tipo();
		
		//ENTRADA DE DADOS
		try {
			//INFORMEI NOME DO PRODUTO
			System.out.print("Informe o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			//INFORMEI DESCRI��O DO PRODUTO
			System.out.print("Informe a descri��o do produto: ");
			objTipo.setDescricacao(leitor.readLine());
			
			//COLOQUEI O "objTipo" DENTRO DO "objProduto"
			objProduto.setObjTipo(objTipo);
			
			//INFORMEI PRE�O DO PRODUTO
			System.out.print("Informe o pre�o do produto: ");
			objProduto.setPreco(Double.parseDouble(leitor.readLine()));
			
			//COLOQUEI O "objProduto" DENTRO DO "objCompra" 
			objCompra.setObjProduto(objProduto);
			
			//INFORMEI A QUANTIDADE DE PRODUTOS
			System.out.print("Informe a quantidade de produtos: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
			
			//INFORME A DATA DA COMPRA
			System.out.print("Informe a data da compra: ");
			objCompra.setDataParaApresentacao(leitor.readLine());
			
			//INFORMEI O CART�O
			System.out.print("Informe o n�mero do seu cart�o: ");
			objCompra.setCartao(leitor.readLine());
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		//SA�DA DE DADOS
		System.out.println("");
		
		System.out.println("Nome do produto: " + objCompra.getObjProduto().getNome());
		
		System.out.println("Descri��o do tipo do produto: " + objCompra.getObjProduto().getObjTipo().getDescricacao());
		
		System.out.println("Pre�o do produto: " + objCompra.getObjProduto().getPreco());
		
		System.out.println("Quantidade de produtos: " + objCompra.getQuantidade());
		
		System.out.println("Valor total: " + (objCompra.getObjProduto().getPreco() * objCompra.getQuantidade()));
		
		System.out.println("Data da compra (Tela): " + objCompra.getDataParaApresentacao());
		System.out.println("Data da compra (DB Date Print Test): " + objCompra.getDataParaPersistencia());
		
		System.out.println("N�mero do Cart�o: " + objCompra.getCartao());
	}
}

