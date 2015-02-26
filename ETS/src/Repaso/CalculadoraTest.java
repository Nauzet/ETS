package Repaso;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	static Calculadora calculadora;

	@BeforeClass
	public static void Antes(){
		calculadora = new Calculadora(15, 3);
	}

	@Test
	public void testSuma() {
		double resultado = calculadora.suma();
		assertTrue(resultado == 18);
	}

	@Test
	public void testResta() {
		double resultado = calculadora.resta();
		assertTrue(resultado == 12);
	}
		
	@Test
	public void testMultiplica() {
		double resultado = calculadora.multiplica();
		assertTrue(resultado == 45);
	
	}
	
	@Test
	public void testDivide() {
		double resultado = calculadora.divide();
		assertTrue(resultado == 5);
	}

}
