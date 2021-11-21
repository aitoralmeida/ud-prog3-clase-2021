import java.util.List;
import java.util.ArrayList;

public class Ejercicio06 {

    private static final char COMODIN = '#';

    /**
     * Guarda en una lista todos los strings numéricos que pueden ser formados substituyendo
     * un caracter comodin. El método recibe un array de chars para reutilizarlo
     * al generar las diferentes combinaciones de caracteres.
     * @param patron string que contiene el patrón a generar por substitución.
     * @param i índice en el patron desde el que generar los strings
     **/
    private static List<String> generarStringNumericos(char[] patron, int i) {
        // caso base. si es el string vacio detenemos la recursividad volviendo 
        // de la función y devolvemos una lista vacía de strings generados
        if (patron.length == 0) return new ArrayList<>();

        // caso base. si el indice i corresponde al final del string se devuelve
        // una lista que contiene el string generado (contenido en el propio patrón).
        if (i == patron.length) {
            List<String> lista = new ArrayList<>();
            lista.add(String.valueOf(patron));
            return lista;
        }

        List<String> cadenas = new ArrayList<>();
        // comprobamos si el caracter actual que estamos procesando es un comodín
        if (patron[i] == COMODIN) {
            // ahora vamos a generar todas las posibles ramas recorriendo
            // todos los posibles que puede tomar el comodín con un bucle.
            for (char c : "0123456789".toCharArray()) {
                patron[i] = c; // substituimos el comodin por el caracter

                // procesamos el resto del patrón resultado de substituir
                // y almacenamos en la lista las cadenas obtenidas
                cadenas.addAll(generarStringNumericos(patron, i + 1));
            }

            // deshacemos ahora los cambios de caracteres comodin para dejar el patrón
            // como estaba antes de las substituciones
            patron[i] = COMODIN;

            // devolvemos la lista de todas las cadenas obtenidas en este caso
            return cadenas;
        } else {
            // si no es un comodin avanzamos recursivamente sin aplicar substituciones
            // y devolvemos directamente la lista obtenida
            return generarStringNumericos(patron, i + 1);
        }
    }

    /**
     * Utilizamos un método para ocultar la inicialización de la recursividad
     * este método recibe un String que será convertido a char[] para el algoritmo
     * recursivo.
     * @param patron string que contiene el patrón a generar por substitución.
     * @return lista con los strings generados a partir del patrón pasado.
     */
    public static List<String> generarStringNumericos(String patron) {
        // iniciamos la recursividad en el primer carácter del string
        return generarStringNumericos(patron.toCharArray(), 0);
    }

    public static void main(String[] args) {
        // probamos el caso vacío. no debe imprimir nada
        System.out.println("String vacío: ");
        List<String> listaStrings = generarStringNumericos("");
        System.out.format("Strings generados: %d%n", listaStrings.size());

        // probamos el patrón "1#2#". se esperan 100 resultados
        System.out.println("String 1#2#: ");
        listaStrings = generarStringNumericos("1#2#");
        System.out.format("Strings generados: %d%n", listaStrings.size());
    }
}
