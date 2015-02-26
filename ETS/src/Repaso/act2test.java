package Repaso;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class act2test {
	static act2 act2 ;

	@BeforeClass
	public static void Antes(){
		act2 = new act2();
	}

	@Test
	public void testSencillo() {
		
		int mayor = act2.sencillo();
		assertTrue(mayor == 1032);
	}

	@Test
	public void testRepetir() {
		int mayor = act2.repetir();
		assertTrue(mayor == 1032);
	}
		
	@Test
	public void testUnico() {
		
		int mayor = act2.unico();
		assertTrue(mayor == 1032);
	}
	
	@Test
	public void testOrden() {
		int mayor = act2.orden();
		assertTrue(mayor == 1032);
	}
	
	@Test
	public void testNegativo() {
		int mayor = act2.negativos();
		assertTrue(mayor == -23);
	}




}