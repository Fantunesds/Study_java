package array;

public class Array2 {

	public static void main(String[] args) {
		String [] [] agenda ={ {"jose de assis","9823-81044","xxx@gmail.com"},
				{"bill","9823-81045","zzz@gmail.com"},{"Linus","982-381034","vvvv@gmail.com"}
		};
		//linha abaixo recupera linha do jose.
		//System.out.println(agenda [0][1]);
		//estrutura abaixo percorre todo array
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("______________________________________________________");
			for (int j = 0; j < agenda.length; j++) {
				
				System.out.println(agenda[i][j]);
				
			}
			
			
		}
	}

}
