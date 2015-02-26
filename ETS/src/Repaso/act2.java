package Repaso;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
	

public class act2 {
	
	public int sencillo() {
		
		int[] vec = {0, -23, -78, 1032, 565};
		
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		
		for (int i=0; i<vec.length; i++) {
			vec[i] = teclado.nextInt();
		}
		
		int mayor = vec[0];
	
		
		for (int i=1; i<vec.length; i++) {
			if (vec[i] > mayor)
				mayor = valores[i];
	
		}
		return mayor;
		
	}
	
	public int repetir() {
		
		int[] vec = {0, -23, -78, 1032, 565, 1032};
		
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		
		for (int i=0; i<vec.length; i++) {
			vec[i] = teclado.nextInt();
		}
		
		int mayor = vec[0];
	
		
		for (int i=1; i<vec.length; i++) {
			if (vec[i] > mayor)
				mayor = valores[i];
	
		}
		return mayor;
	}

	public int unico() {
		int[] vec = {1032};
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		
		for (int i=0; i<vec.length; i++) {
			vec[i] = teclado.nextInt();
		}
		
		int mayor = vec[0];
	
		
		for (int i=1; i<vec.length; i++) {
			if (vec[i] > mayor)
				mayor = valores[i];
	
		}
		return mayor;
	}
	
	public int orden() {
		
		int[] vec = {0, -23, -78, 1032, 565};
		
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		
		for (int i=0; i<vec.length; i++) {
			vec[i] = teclado.nextInt();
		}
		
		int mayor = vec[0];
	
		
		for (int i=1; i<vec.length; i++) {
			if (vec[i] > mayor)
				mayor = valores[i];
	
		}
		return mayor;
	}

	public int negativos() {
		
		int[] vec = {- 65, -23, -78, -1032, -565};
		
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		
		for (int i=0; i<vec.length; i++) {
			vec[i] = teclado.nextInt();
		}
		
		int mayor = vec[0];
	
		
		for (int i=1; i<vec.length; i++) {
			if (vec[i] > mayor)
				mayor = valores[i];
	
		}
		return mayor;
	}

}	


