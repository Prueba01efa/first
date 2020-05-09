package firstGitHub;
import java.util.ArrayList;
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
