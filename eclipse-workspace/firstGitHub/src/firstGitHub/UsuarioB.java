package firstGitHub;

import java.util.ArrayList;

/**
 * Creamoa un ArrayList, introducimos ciertos numeros y despues 
 * mediante un mensaje llamamos al metodo contadonNumbers para ver
 * la media de estos
 * @author andexo
 *
 */
public class UsuarioB {
	
	/**
	 * Metodo Main, se crea el ArrayList, se introduce los numeros
	 * y se llama al metodo contadoNumbers
	 * 
	 */
	public static void main(String[] args) {
	
				
		
		//ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(35);
		numbers.add(80);
		numbers.add(45);
		
		//Mostrar media del Array
		System.out.printf("La media es : %d",contadorNumbers(numbers));
		

	}
	/**
	 * Metodo, recorre el for tantas numeros el ArrayList tenga
	 * los suma a una variable suma y luego retorna la media de estos
	 * 
	 * @param a ArrayList pasado en el main 
	 * @return devuelve media de los numeros 
	 */
	public static int contadorNumbers(ArrayList<Integer> a) {
		int suma=0;
		for (int i = 0; i < a.size(); i++) {
			suma+=a.get(i);
		}
		return suma/a.size();
	}

}
