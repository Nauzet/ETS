package Examen;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Repaso.Calculadora;

public class CuentaTest {
	
	static Cuenta cuenta;
		
	@BeforeClass
	public static void Antes() {
		
		cuenta = new Cuenta(null, 0);
		
	}

	@Test
	public void deposito2500() {
		
		double resultado = cuenta.deposito(2500);
		
		assertTrue(resultado == 2500);
	
	}
	
	@Test
	public void deposito50() {
		
		double resultado = cuenta.deposito(50.25);
		
		assertTrue(resultado == 2550.25);
	
	}

	@Test
	public void retirosi() {
		
		double resultado = cuenta.retiro(1);
		
		assertTrue(resultado == 2549.25);
	
	}
	
	@Test
	public void retirono() {
		
		double resultado = cuenta.retiro(3000);
		
		assertTrue(resultado == -1);
	
	}

}
