package negocio;

public class OldFashion extends Drink implements Mixer{
	//M�TODOS IMPLEMENTADOS DA INTERFACE
	public void misturar() {
		super.adicionar(new Ingrediente("Whiskey", 50, "ml"));
		super.adicionar(new Ingrediente("Laranja", 1, "unidade"));
		super.adicionar(new Ingrediente("Torr�o de a��car", 1, "unidade"));
		super.adicionar(new Ingrediente("Gelo", 1, "pedra"));
	}
}
