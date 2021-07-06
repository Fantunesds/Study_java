package polimorfismo;

public class Refrigerante extends Drink {
	
	public Refrigerante() {
		super("Refrigerante", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("___________________________________________");
		System.out.println("Pegar o copo");
		System.out.println("Colocar Agua com gás");
		System.out.println("Adcionar xarope");
		System.out.println("Colocar gelo");
	}

}
