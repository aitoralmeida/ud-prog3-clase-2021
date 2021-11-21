public class Ejercicio16 {
    
    /**
     * Imprime todas las cadenas de longitud r construidas como variaciones
     * con repetición de los elementos contenidos en un array de caracteres,
     * que cumplan la condición de que no tienen más de un número dado de 
     * @param r longitud de las cadenas a construir
     * @param m número máximo de caracteres de tipo número que puede tener el string
     * @param nNum contador de caracteres de tipo número en el string
     * @param resultado string sobre el que se genera la cadena.
     */
    private static void imprimirVariacionesCond(char[] conjunto, int r, int m, int nNum, String resultado) {
        // caso base.
        // si el número de caracteres de tipo numérico en el resultado es mayor que m
        // se deja de explorar la recursividad 
        if (nNum > m) return;

        // caso base. cadena a generar de longitud cero
        if (r == 0) {
            // se imprime el contenido de resultado
            // y se termina la recursividad
            System.out.println(resultado);
            return;
        }

        // caso recursivo. // concatenar un caracter del conjunto al resultado
        // se realiza una llamada por cada caracter en el conjunto
        for (char c : conjunto) {
            if (Character.isDigit(c)) {
                // si el caracter a añadir es de tipo numérico se incrementa 
                // el contador de números añadidos en la llamada
                imprimirVariacionesCond(conjunto, r - 1, m, nNum + 1, resultado + c);
            } else {
                // si el carácter añadido no es de tipo numérico se mantiene el valor
                // actual de números en la cadena resultado
                imprimirVariacionesCond(conjunto, r - 1, m, nNum, resultado + c);
            }
        }
    }

    public static void main(String[] args) {
        imprimirVariacionesCond(new char[]{ 'A', 'B', 'C', '1', '2'}, 3, 3, 0,"");
    }
}
