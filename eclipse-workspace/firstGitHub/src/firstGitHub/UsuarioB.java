package firstGitHub;

import java.util.ArrayList;
public class UsuarioB {

	public static void main(String[] args) {
	
				
		
		//ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(35);
		numbers.add(80);
		numbers.add(45);
		
		//Mostrar media 
		System.out.printf("La media es : %d",contadorNumbers(numbers));
		

	}
	
	public static int contadorNumbers(ArrayList<Integer> a) {
		int suma=0;
		for (int i = 0; i < a.size(); i++) {
			suma+=a.get(i);
		}
		return suma/a.size();
	}

}
