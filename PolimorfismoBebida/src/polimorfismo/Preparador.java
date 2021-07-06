package polimorfismo;

public class Preparador {
	
	public void prepararBebida (Drink bebida) {
		System.out.println("Preparando o Drink " + bebida.getNome());
		
		bebida.preparar();
		
		if(bebida.isAquecer()) {
			System.out.println("Aquecendo a Bebida " + bebida.getNome());
		}
		
		System.out.println("Drink preparado com Sucesso " + bebida.getNome());
		
		
		
	}

}
