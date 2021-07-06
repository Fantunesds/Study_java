package polimorfismo;

public class Drink {
	
	private String nome;
	private boolean aquecer;
	
	public Drink(String nome,boolean aquecer) {
		
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean isAquecer() {
		return aquecer;
	}
	
	public void preparar() {
		
	}
}
