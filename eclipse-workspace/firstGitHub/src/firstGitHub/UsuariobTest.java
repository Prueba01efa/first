package firstGitHub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
/**
 * Pruebas de UsuarioB.java , se hacen 2 pruebas diferentes
 * misma prueba pero con diferentes numeros, se crea un ArrayList
 * con ciertos numeros (pequeños y grandes)  se crea una variable
 * y se la pasa el valor del metodo UsuarioB.java.
 * Despues comprobaremos el resultado esperado con assertEquals
 * verde-> correcto negro-> malo
 * @author andexo
 *
 */
class UsuariobTest {

	@Test
	/**
	 * Metodo que comprueba el el valor recodigo con el esperado,
	 * crea un ArrayList , pasa unos numeros , crea una variable y 
	 * se pasa el valor del metodo en la clase UsuarioB.java 
	 * y comprobamos con assertEquals
	 */
	public void result30() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(30);
		numeros.add(30);
		numeros.add(30);
		numeros.add(30);
		
		int x = UsuarioB.contadorNumbers(numeros);
		
		assertEquals(x,30);
	}
	
	
	@Test
	/**
	 * Metodo que comprueba el el valor recodigo con el esperado,
	 * crea un ArrayList , pasa unos numeros , crea una variable y 
	 * se pasa el valor del metodo en la clase UsuarioB.java 
	 * y comprobamos con assertEquals
	 */
	public void result402() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(50);
		numeros.add(900);
		numeros.add(420);
		numeros.add(400);
		numeros.add(250);
		
		int x = UsuarioB.contadorNumbers(numeros);
		
		assertEquals(x,404);
	}
	
}
