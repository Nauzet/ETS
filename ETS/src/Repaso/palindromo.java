package Repaso;

public class palindromo {
	

	
	public static String crearPalindromo(String frase){ 
		
		String cosasQuitar=";:,.-_'!¡¿?";
		for(int i=0; i < cosasQuitar.length(); i++){
			char letraQuitar=cosasQuitar.charAt(i);
			String quitar=Character.toString(letraQuitar);
			frase=frase.replace(quitar, "");	
		}
		String alreves="";
		for(int i=frase.length()-1; i >= 0; i--){
			alreves=alreves + frase.charAt(i);
		}
		return frase+alreves;
	}
	 public static boolean mostrarPalindromo(String frase){
		String alreves="";
		for(int i=frase.length()-1; i >= 0; i--){
			alreves=alreves + frase.charAt(i);
			
	 }
		if(frase.equalsIgnoreCase(alreves)){
			return true;
		}else{
			return false;
		}
		}
	}