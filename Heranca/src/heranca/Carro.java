package heranca;

public class Carro extends Veiculo {
	
	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Quatro Portas: " + quatroPortas);
	}
	
//	private String marca;
//	private String modelo;
//	private int ano;

}
