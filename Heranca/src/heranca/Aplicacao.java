package heranca;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Veiculo v = new Veiculo();
		Carro c = new Carro();
		c.buzinar();
		c.setMarca("LordsMobile");
		c.setModelo("Ceifador");
		c.setAno(2000);
		c.setQuatroPortas(true);
		c.imprimirDados();
		
		Caminhao cam = new Caminhao();
		cam.buzinar();
		
		Motocicleta mo = new Motocicleta();
		mo.buzinar();
		mo.empinar();
		
	//	v.setMarca("Astra");
	//	v.setAno(1998);
	//	v.setModelo("Turbo");
		
		////
		
		
	//	v.buzinar();
	//	v.imprimirDados();
		
		

	}
	
}
