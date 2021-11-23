
public class Ejercicio04b {
	
	public static void imprimirStrBinarios(String binario, String resultado) {
		if (binario.length() == 0) {
			System.out.println(resultado);
		} else {
			if (binario.charAt(0) == 'b') {
				imprimirStrBinarios(binario.substring(1), resultado + "0");
				imprimirStrBinarios(binario.substring(1), resultado + "1");
			} else {
				imprimirStrBinarios(binario.substring(1), resultado + binario.charAt(0));
			}
		}
	}
	
	public static void main(String[] args) {
		imprimirStrBinarios("1bb1b", "");
		
	}

}
