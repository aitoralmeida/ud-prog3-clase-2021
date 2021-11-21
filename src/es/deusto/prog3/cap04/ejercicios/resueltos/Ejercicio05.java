public class Ejercicio05 {

    private static final char COMODIN = '#';

    /**
     * Genera todos los strings numéricos que pueden ser formados substituyendo
     * un caracter comodin.
     * @param patron string que contiene el patrón a generar por substitución.
     * @param i índice en el patron desde el que generar.  
     **/
    private static void imprimirStrNumericosRec(char[] patron, int i) {
        // caso base. si es el string vacio no se pueden generar strings.
        // se detiene la recursividad
        if (patron.length == 0) return;

        // caso base. si hemos llegado al final del string imprimimos la cadena
        // actual y detenemos la recursividad volviendo de la función
        if (i == patron.length) {
            System.out.println(patron);
            return;
        }

        // comprobamos si el caracter actual que estamos procesando es un comodín
        if (patron[i] == COMODIN) {
            // ahora vamos a generar todas las posibles ramas recorriendo
            // todos los posibles que puede tomar el comodín con un bucle.
            for (char c : "0123456789".toCharArray()) {
                patron[i] = c; // substituimos por el caracter que toque
                imprimirStrNumericosRec(patron, i + 1);
            }

            // deshacemos ahora los cambios de caracteres comodin en la vuelta atrás
            patron[i] = COMODIN;
        } else {
            // si no es un comodin avanzamos recursivamente sin aplicar substituciones
            imprimirStrNumericosRec(patron, i + 1);
        }
    }

    /**
     * Utilizamos un método para ocultar la inicialización de la recursividad
     * este método recibe un String que será convertido a char[] para el algoritmo
     * recursivo.
     * @param patron string que contiene el patrón a generar por substitución.
     */
    public static void imprimirStrNumericos(String patron) {
        // iniciamos la recursividad en el primer carácter del string
        imprimirStrNumericosRec(patron.toCharArray(), 0);
    }

    public static void main(String[] args) {
        // probamos el caso vacío. no debe imprimir nada
        System.out.println("String vacío: ");
        imprimirStrNumericos("");
        System.out.println("");

        // probamos el patrón "1#2#". se esperan 100 resultados
        System.out.println("String 1#2#: ");
        imprimirStrNumericos("1#2#");
        System.out.println("");
    }
}
