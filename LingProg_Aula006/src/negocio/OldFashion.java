package negocio;

public class OldFashion extends Drink implements Mixer{
	//MÉTODOS IMPLEMENTADOS DA INTERFACE
	public void misturar() {
		super.adicionar(new Ingrediente("Whiskey", 50, "ml"));
		super.adicionar(new Ingrediente("Laranja", 1, "unidade"));
		super.adicionar(new Ingrediente("Torrão de açúcar", 1, "unidade"));
		super.adicionar(new Ingrediente("Gelo", 1, "pedra"));
	}
}
