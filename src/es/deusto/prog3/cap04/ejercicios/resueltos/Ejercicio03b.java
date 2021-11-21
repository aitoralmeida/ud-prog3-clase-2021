public class Ejercicio03b {

    /**
     * Determina si un string es palíndromo. 
     * El proceso se realiza comparando, desde cada extremo, los caracteres
     * por parejas. Cuando se encuentra una pareja que no coincide, el string
     * no es un palíndromo.
     * @param str string a comprobar si es o no palíndromo
     * @param izq índice del carácter de la izquierda a comprobar
     * @param der índice del carácter de la derecha a comprobar
     * @return devuelve true/false si el string recibido es o no palíndromo, respectivamente.
     */
    private static boolean esPalindromoRec(String str, int izq, int der) {
        // caso base 1. si hemos superado la mitad del string
        // es el caso también en el que el string tiene un único caracter o
        // está vacío (en ambos casos es palíndromo por definición).
        // no se realiza llamada recursiva y se devuelve true
        if (izq >= der) return true;

        // caso base 2. si al comparar una pareja no son el mismo carácter
        // hemos identificado que no puede ser palíndromo.
        // no es necesario hacer más llamadas recursivas, se devuelve false
        if (str.charAt(izq) != str.charAt(der)) return false;

        // caso recursivo. se avanzan los índices izquierda y derecha para
        // reducir el string a comprobar
        return esPalindromoRec(str, izq + 1, der - 1);
    }

    /**
     * Método no recursivo que inicializa y oculta los parámetros extra que
     * son particulares a la implementación recursiva.
     * @param str string a comprobar si es o no palíndromo
     * @return devuelve true/false si el string recibido es o no palíndromo, respectivamente.
     */
    public static boolean esPalindromo(String str) {
        // se inicia el algoritmo recursivo desde el primer caracter hasta el último
        return esPalindromoRec(str, 0, str.length() - 1);
    }

    public static void main(String[] args) {
        // probamos con un ejemplo palindrómico
        String s = "dabalearrozalazorraelabad";
        System.out.format("\"%s\": %b%n", s, esPalindromo(s));

        // probamos con un ejemplo no palindrómico
        s = "esta frase no es un palíndromo";
        System.out.format("\"%s\": %b%n", s, esPalindromo(s));

        // probamos con un string con un único caracter, que es
        // palíndromo por definición.
        s = "A";
        System.out.format("\"%s\": %b%n", s, esPalindromo(s));

        // por definición, el string vacío es un palíndromo
        s = "";
        System.out.format("\"%s\": %b%n", s, esPalindromo(s));
    }
}
