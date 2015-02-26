package Repaso;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculadora {
	private double a;
	private double b;
	public Calculadora(double a, double b) {
		this.a = a;
		this.b = b;
	}
public double suma() {
	return a + b;
}
public double resta() {
	return a - b;
}
public double multiplica() {
	return a * b;
}
public double divide() {
	return a / b;
}
}
