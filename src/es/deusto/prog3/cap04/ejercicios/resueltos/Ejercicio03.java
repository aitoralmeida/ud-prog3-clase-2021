public class Ejercicio03 {

    /**
     * Determina si un string es palíndromo. 
     * El proceso se realiza comparando, desde cada extremo, los caracteres
     * por parejas. Cuando se encuentra una pareja que no coincide, el string
     * no es un palíndromo.
     * @param str string a comprobar si es o no palíndromo
     * @return devuelve true/false si el string recibido es o no palíndromo, respectivamente.
     */
    private static boolean esPalindromo(String str) {
        // caso base 1. si el string es vacío o de longitud 1 es palíndromo por definición
        if (str.length() <= 1) return true;

        // caso base 2. si al comparar el caracter inicial y final del string
        // son distintos, no puede ser palíndromo
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;

        // caso recursivo. comrpueba si el string resultante de eliminar el
        // primer y el último caracter es palíndromo
        return esPalindromo(str.substring(1, str.length() - 1));
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
