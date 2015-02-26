package Repaso;

import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {

		double base, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base: ");
		base = sc.nextDouble();
		
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		
		area = (base + altura) / 2;
		
		System.out.println("El área: " + area);
		
		sc.close();

	}

}
