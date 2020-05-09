package firstGitHub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class UsuariobTest {

	@Test
	
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
