package negocio;

public class Drink {
	//PROPRIEDADES DA CLASSE
	Ingrediente[] colecao = new Ingrediente[10];
	int quantidadeIngrediente = 0;
	
	//MÉTODOS DA CLASSE
	public void adicionar(Ingrediente objIngrediente) {
		if (quantidadeIngrediente < colecao.length) {
			colecao[quantidadeIngrediente] = objIngrediente;
			quantidadeIngrediente++;
		}
	}
	
	public void beber() {
		for (int i = 0 ; i < quantidadeIngrediente ; i++) {
			System.out.println(colecao[i].getQuantidade() + " " + 
							   colecao[i].getUnidade() + " de " +
							   colecao[i].getNome());
		}
	}
}
