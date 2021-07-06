package polimorfismo;

public class Aplicacao {

	public static void main(String[] args) {
		
	//	Animal a = new Cachorro();
	//	
   //		if ( a instanceof Cachorro) {
	//		Cachorro c = (Cachorro) a ;
	//		c.morder();
	//	}
	
		
	//	Gato g = new Gato();
	//	g.falar();
		
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		
		falar(dog);
		falar(cat);
		

	}
	
	
	private static void falar (Animal a) {
		a.falar();
	}
	
	
	

}
