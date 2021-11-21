public class Ejercicio15 {
    
    /**
     * Imprime todas las cadenas de longitud r construidas como variaciones
     * con repetición de los elementos contenidos en un array de caracteres.
     * @param r longitud de las cadenas a construir
     * @param resultado string sobre el que se genera la cadena.
     */
    private static void imprimirVariaciones(char[] conjunto, int r, String resultado) {
        // caso base. cadena a generar de longitud cero
        if (r == 0) {
            // se imprime el resultado 
            System.out.println(resultado);
        } else {
            // concatenar un caracter al resultado
            // se realiza una llamada por cada caracter en el conjunto
            for (char c : conjunto) {
                
                imprimirVariaciones(conjunto, r - 1, resultado + c);
            }
        }
    }

    public static void main(String[] args) {
        // se ha optado por realizar la llamada directamente, pero como en
        // otros ejemplos se podría crear un método no-recursivo para ocultar
        // el parámetro extra "resultado" al usuario.
        char[] conjunto = new char[]{ 'A', 'B', 'C' };
        imprimirVariaciones(conjunto, 5, "");
    }
}
