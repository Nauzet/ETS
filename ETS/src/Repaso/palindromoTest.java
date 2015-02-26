package Repaso;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class palindromoTest {
		private String realizar;
		@Before
		public void antes(){
			
			realizar="";
		}
		@After
		public void testPali(){
			
		assertTrue(palindromo.mostrarPalindromo(realizar));
		
		}

		@Test
		public void testVacio(){
			realizar=palindromo.crearPalindromo("");
		}
		@Test
		public void testBlancoInicio(){
			realizar=palindromo.crearPalindromo(" verano");
		}
		@Test
		public void testBlancoFin(){
			realizar=palindromo.crearPalindromo("verano ");
		}
		@Test
		public void testUno() {
			realizar=palindromo.crearPalindromo("a");
		}
		@Test
		public void testTamaño4(){
			realizar=palindromo.crearPalindromo("abcd");
		}
		@Test
		public void testTamaño10(){
			realizar=palindromo.crearPalindromo("nauzet1234");
		}
		@Test
		public void testTamaño50(){
			realizar=palindromo.crearPalindromo("abcdefghijklmnñopqrstuvwxyzabcdefghijklmnñopqrstuv");
		}
		@Test
		public void testMayus(){
			realizar=palindromo.crearPalindromo("VERANO");
		}
}