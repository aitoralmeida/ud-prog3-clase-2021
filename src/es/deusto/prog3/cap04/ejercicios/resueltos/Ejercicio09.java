public class Ejercicio09 {

    /**
     * Método que recibe un string y devuelve un string invertido carácter
     * a carácter desde el inicio hasta el índice indicado.
     * @param str string a invertir
     * @return string invertido carácter a carácter
     */
    private static String invertirString(String str) {
        // caso base. si es el string vacío devolvemos directamente el string vacío.
        if (str.isEmpty()) return "";

        // caso recursivo. se retorno el string resultado de concatenar, en orden inverso, el caracter
        // el primer caracter de string con el resultado de aplicar la función al resto del string
        return invertirString(str.substring(1, str.length())) + str.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.format("\"%s\" -> \"%s\"%n", "", invertirString("")); // string vacío

        String s = "A"; // string longitud 1
        System.out.format("\"%s\" -> \"%s\"%n", s, invertirString(s));
        
        s = "Hola, esto es una prueba"; // string general
        System.out.format("\"%s\" -> \"%s\"%n", s, invertirString(s));
    }
}
