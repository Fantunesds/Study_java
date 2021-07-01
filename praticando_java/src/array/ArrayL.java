package array;

import java.util.ArrayList;


public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Fabio antunes");
		contatos.add("99999-99999");
		contatos.add("chota@gmail.com");
		
		contatos.add("ziraldo zé");
		contatos.add("99999-99999");
		contatos.add("ziraldo@gmail.com");
		System.out.println("Tamanho do Array " + contatos.size());
		System.out.println(contatos);
		System.out.println("Email Fabio antunes (indice[2]) " + contatos.get(2));
		System.out.println("_____________________________________________________________");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}
			
		}

	}


