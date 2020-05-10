package firstGitHub;
import java.util.ArrayList;


/**
 * 
 * La clase genera un ArrayList con numeros y llamna a un metodo 
 * para comprobar cual de esos numeros termina en 3
 * 
 * @author Prueba01efa
 *
 */
public class Main {

	
	
	public static void main(String[] args) {
		
		//Creacion Array List
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//Añadir elementos ArrayList
		numeros.add(1);
		numeros.add(10);
		numeros.add(11);
		numeros.add(13);
		numeros.add(3);
		numeros.add(23);
		numeros.add(80);
		numeros.add(443);
		numeros.add(2);
		
		//Ver numeros terminados en 3
		
		System.out.println("Numeros terminados en 3 : "+contadorArray(numeros));
	
		
	}
	
	/**
	 * Hacemos un for que recorrra el ArrayList en busqueda de cada número 
	 * 
	 * @param a Pasamos el ArrayList del main  
	 * @return devuelve cuantos numeros terminan en 3
	 */
	public static  int contadorArray(ArrayList<Integer> a) {
		//Contador de numeros terminados en 3
		int x =0;
		
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i)%10 == 3) {
				x++;
			}
		}
		
		return x;
	}

}
