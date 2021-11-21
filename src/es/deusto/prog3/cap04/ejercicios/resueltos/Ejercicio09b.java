public class Ejercicio09b {

    /**
     * Método que recibe un string y devuelve un string invertido carácter
     * a carácter desde el inicio hasta el índice indicado.
     * @param str string a invertir
     * @param i índice deesde el cuál se lleva a cabo la inversión del string
     * @return string resultado de invertir el string recibido
     */
    private static String invertirStringRec(String str, int i) {
        if (i < 0) return ""; // caso base. string vacío.

        // caso recursivo. se retorno el string resultado de unir el caracter
        // actual i con el string obtenido de invertir el string actual sin
        // el último caracter.
        return str.charAt(i) + invertirStringRec(str, i - 1);
    }

    /**
     * Método que recibe un string y devuelve el mismo string invertido carácter
     * a carácter.
     * @param str string a invertir
     * @return string resultado de invertir el string recibido
     */
    private static String invertirString(String str) {
        return invertirStringRec(str, str.length() - 1);
    }
    
    public static void main(String[] args) {
        System.out.format("\"%s\" -> \"%s\"%n", "", invertirString("")); // string vacío

        String s = "A"; // string longitud 1
        System.out.format("\"%s\" -> \"%s\"%n", s, invertirString(s));
        
        s = "Hola, esto es una prueba"; // string general
        System.out.format("\"%s\" -> \"%s\"%n", s, invertirString(s));
    }
}