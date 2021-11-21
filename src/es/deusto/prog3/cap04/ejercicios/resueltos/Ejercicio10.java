public class Ejercicio10 {

    /**
     * Método recursivo que devuelve un string resultado de invertir, en el string recibido,
     * el orden de cada palabra.
     * @param str string al que aplicar la inversión palabra a palabra
     * @return string invertido palabra a palabra
     */
    private static String invertirPalabras(String str) {
        // caso base. si es el string vacío se devuelve otro string vacío
        if (str.isEmpty()) return "";
        
        // se intenta dividir el string en dos partes por el primer separador
        String[] partes = str.split("[\\W]", 2);

        // se comprueba si se ha podido partir el string en dos partes
        // primera palabra + resto de frase
        if (partes.length < 2) {
            // caso base
            // si solamente había una parte tras la partición se devuelve dicha
            // parte directamente
            return partes[0];
        }

        // caso recusivo.
        // si hay dos partes tras la partición del string se aplica la 
        // la inversión a la segunda parte y se concatena la primera parte
        return invertirPalabras(partes[1]) + " " + partes[0];
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
