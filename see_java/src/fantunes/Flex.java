/*
 * @author fantunes
 * Programa que informa qual melhor op��o entre alcool e gasolina.
 * 
 * */
package fantunes;

import java.util.Scanner;

public class Flex {

	public static void main(String[] args) {
		
		//variable
		double alcool,gasolina;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor do alcool:");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina:");
		gasolina = teclado.nextDouble();
		teclado.close();
		//Processamento
		if(alcool < 0.7 * gasolina ) {
			System.out.println("Abaste�a com Alcool");
		}else {
			System.out.println("Abaste�a com Gasolina");
		}
		

	}

}
