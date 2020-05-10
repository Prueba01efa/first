package firstGitHub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
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
