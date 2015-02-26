package Repaso;

import java.util.Scanner;

public class burbuja {
	public static void main(String[] args) {
		int[] numeros;
		int a, p;

		Scanner lector = new Scanner(System.in);
		System.out.println("Numeros a introducir:");
		int l = lector.nextInt();
		numeros = new int[l];
		for (int el = 0; el <= l - 1; el++) {
			System.out.println("Número");
			numeros[el] = lector.nextInt();
		}
		for (int c = 0; c <= l; c++) {
			for (int d = 0; d <= l - 2; d++) {
				a = numeros[d];
				p = numeros[d + 1];
				if (a > p) {
					numeros[d] = p;
					numeros[d + 1] = a;
				}
			}
		}
		for (int el = 0; el <= l - 1; el++) {
			System.out.println(numeros[el]);
		}
	}
}
