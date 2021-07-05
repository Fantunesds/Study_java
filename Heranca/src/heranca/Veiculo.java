/*
 * 
 * @outhor fantunes
 * 
 * neste caso vamos substituir o private por protected para ficar visivel para as subclasses. 
 * 
 * */
package heranca;

public class Veiculo {
	
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar() {
		System.out.println("Bi Bi");
	}
	
	public void imprimirDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
	public void empinar() {
		System.out.println("///////////////");
		System.out.println("Olha a Rocam");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
