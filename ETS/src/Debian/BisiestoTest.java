package Debian;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BisiestoTest {
	
	Bisiesto n = new Bisiesto();

	static Bisiesto bisiesto;
	
	@Test
	public void testNo4No100() {
		assertTrue(n.cuatro(2013) == false && n.cien(2013) == false);
	}
	
	@Test
	public void test4No100() {
		assertTrue(n.cuatro(2012) == true && n.cien(2012) == false);
	}
	
	@Test
	public void test4y100() {
		assertTrue(n.cuatro(1700) == true && n.cien(1700) == true);
	}
	
	@Test
	public void test4y100y400() {
		assertTrue(n.cuatro(2000) == true && n.cien(2000) == true && n.numero(2000) == true);
	}
	
	@Test
	public void test1993() {
		assertTrue(n.cuatro(1993) == false && n.cien(1993) == false && n.numero(1993) == false);
	}
}
