package Debian;

public class Bisiesto {
	
	public boolean cuatro(int n) {
			
			if (n % 4 == 0)
				return true;
			else
				return false;
		}
	
	public boolean cien(int n) {
	
			if (n % 100 != 0)
				return false;
			else
				return true;
		}
	
	public boolean numero(int n) {
			
			if (n % 400 == 0)
				return true;
			else
				return false;
		}
	
}