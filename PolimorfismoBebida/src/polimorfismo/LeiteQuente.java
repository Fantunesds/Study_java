package polimorfismo;

public class LeiteQuente extends Drink {
	
	public LeiteQuente() {
		super("Leite Quente", true);
	}
	
	public void preparar() {
		System.out.println("Pegando o copo");
		System.out.println("Colocando Leite no copo");
	}
	
}
