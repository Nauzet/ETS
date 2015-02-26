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
		public void testTama�o4(){
			realizar=palindromo.crearPalindromo("abcd");
		}
		@Test
		public void testTama�o10(){
			realizar=palindromo.crearPalindromo("nauzet1234");
		}
		@Test
		public void testTama�o50(){
			realizar=palindromo.crearPalindromo("abcdefghijklmn�opqrstuvwxyzabcdefghijklmn�opqrstuv");
		}
		@Test
		public void testMayus(){
			realizar=palindromo.crearPalindromo("VERANO");
		}
}