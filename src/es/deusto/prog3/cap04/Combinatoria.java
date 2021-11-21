package es.deusto.prog3.cap04;

public class Combinatoria {
	
	
	private static void combinaLetrasIterativo(char[] letras) {
		
		for(char c1 : letras){
			for (char c2 : letras) {
				System.out.println("" + c1 + c2);
			}	
		}	
	}
	
	
	private static void combinaLetrasRecur(char[] letras, int size, String combBase) {
		if (size==0) {
			System.out.println(combBase);
		} else {
			for (char c : letras) {
				combinaLetrasRecur(letras, size-1, combBase+c);
			}
			
		}
		
	}
	
	public static void main(String[] a) {

		char[] letras = {'a', 'b', 'c'};
		Combinatoria.combinaLetrasIterativo(letras);
		Combinatoria.combinaLetrasRecur(letras, 4, "");
		
		
	}

}
