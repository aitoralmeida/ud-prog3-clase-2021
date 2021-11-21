public class Ejercicio10b {

    // string con los separadores para palabras
    private static final String SEPARADORES = " ,.;\t";

    /**
     * Método recursivo que devuelve un string resultado de invertir, en el string recibido,
     * el orden de cada palabra.
     * @param str string al que aplicar la inversión palabra a palabra
     * @param i índice del carácter del string en el que comenzar la inversión de palabras.
     * @param resultado string auxiliar que se utiliza para obtener la palabra procesada hasta el momento.
     * @return string invertido palabra a palabra
     */
    private static String invertirPalabrasRec(String str, int i, String resultado) {
        // caso base. si el índice indica es el final del string
        // se devuelve la palabra procesada hasta el momento.
        if (i == str.length()) return resultado;
        
        // caso recursivo. se obtiene el caracter en el indice actual.
        char c = str.charAt(i);
        // se comprueba si dicho caracter es un separador.
        if (SEPARADORES.indexOf(c) != -1)
            // si el caracter es un separador, se obtiene el resultado de invertir
            // el resto de las palabras del string, que se concatenan a la palabra actual,
            // utilizando el caracter como separador en el nuevo string.
            return invertirPalabrasRec(str, i + 1, "") + c + resultado;
        else {
            // si no es un separador, se obtiene el resultado de invertir el resto de
            // las palabras del string, actualizando la palabra para incluir el caracter
            // procesado
            return invertirPalabrasRec(str, i + 1, resultado + c);
        }

    }

    /**
     * Método que devuelve un string resultado de invertir, en el string recibido,
     * el orden de cada palabra.
     * @param str string al que aplicar la inversión palabra a palabra
     * @return string invertido palabra a palabra
     */
    private static String invertirPalabras(String str) {
        return invertirPalabrasRec(str, 0, "");
    }
    
    public static void main(String[] args) {
        String s = ""; // string vacío
        System.out.format("\"%s\" -> \"%s\"%n", s, invertirPalabras(s));

        s = "prueba"; // string con una única palabra
        System.out.format("\"%s\" -> \"%s\"%n", s, invertirPalabras(s));

        s = "Hola, esto es una prueba"; // string con varias palabras
        System.out.format("\"%s\" -> \"%s\"%n", s, invertirPalabras(s));
    }
}
