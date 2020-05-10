package firstGitHub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Classe prueba de main.java, tenemos 2 pruebas diferentes , una con numeros pequeños
 * y otra con numeros grandes
 * @author Prueba01efa
 *
 */
class MainTest {
	
	@Test
	/**
	 * Crea un ArrayList de enteros, rellena con numeros y despues 
	 * introducimos en una varianle el resultado del metodo contadorArray de Main
	 * hacemos un assertEquals para comprobar resultado
	 */
	public void numerosSmall() {
		ArrayList<Integer> small = new ArrayList<Integer>();
		small.add(1);
		small.add(3);
		small.add(13);
		small.add(11);
		small.add(23);
		small.add(30);
		
		int x = Main.contadorArray(small);
		assertEquals(x,3);
	}
	
	@Test
	/**
	 * Crea un ArrayList de enteros, rellena con numeros y despues 
	 * introducimos en una varianle el resultado del metodo contadorArray de Main
	 * hacemos un assertEquals para comprobar resultado
	 */
	public void numerosBig() {
		ArrayList<Integer> small = new ArrayList<Integer>();
		small.add(1000);
		small.add(3503);
		small.add(9033);
		small.add(200003);
		small.add(9103);
		small.add(4522);
		
		int x = Main.contadorArray(small);
		assertEquals(x,4);
	}

}
