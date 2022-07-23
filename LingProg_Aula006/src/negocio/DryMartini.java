package negocio;

public class DryMartini extends Drink implements Mixer{
	//MÉTODOS IMPLEMENTADOS DA INTERFACE
	public void misturar() {
		super.adicionar(new Ingrediente("Vodka", 50, "ml"));
		super.adicionar(new Ingrediente("Gin", 50, "ml"));
		super.adicionar(new Ingrediente("Vermute", 10, "ml"));
		super.adicionar(new Ingrediente("Azeitona", 3, "unidades"));
		super.adicionar(new Ingrediente("Gelo", 5, "pedras"));
	}
}
