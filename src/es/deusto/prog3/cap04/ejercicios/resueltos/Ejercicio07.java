public class Ejercicio07 {

    /**
     * Intercambia los caracteres indicados en el array de caracteres.
     * @param str array de caracteres.
     * @param a índice del elemento a intercambiar
     * @param b índice del elemento a intercambiar
     */
    private static void intercambiar(char[] str, int a, int b) {
        char c = str[a];
        str[a] = str[b];
        str[b] = c;
    }

    /**
     * Imprime las diferentes permutaciones de un string dado por pantalla.
     * @param str array de caracteres que contiene los elementos a permutar.
     * @param i índice del array desde el que comenzar las permutaciones.
     */
    private static void permutarRec(char[] str, int i) {
        if (i == str.length - 1) {
            // caso base. si se ha alcanzado el último elemento del array.
            System.out.println(str);
        } else {
            // se recorren todos los caracteres a permutar desde el índice actual
            for (int c = i; c < str.length; c++) {
                intercambiar(str, c, i); // se realiza un intercambio
                permutarRec(str, i + 1); // se sigue permutando desde el siguiente caracter
                intercambiar(str, i, c); // se deshace el intercambio.
            }
        }
    }

    /**
     * Método no recursivo que oculta la inicialización del método recursivo.
     * @param str array de caracteres que contiene los elementos a permutar.
     */
    public static void imprimirPermutaciones(String str) {
        // comprobamos que el string no sea nulo para poder empezar el algoritmo
        // recursivo iniciando los valores correctos para los índices
        permutarRec(str.toCharArray(), 0);
    }

    public static void main(String[] args) {
        // probamos con el string vacío. 0 permutaciones
        System.out.println("String vacío");
        imprimirPermutaciones("");
        System.out.println("");

        // probamos con el string "ABC", esperamos 6 permutaciones
        System.out.println("String ABC");
        imprimirPermutaciones("ABC");
        System.out.println("");
    }
}
