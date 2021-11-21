public class Ejercicio04 {

    private static final char COMODIN = 'b';

    /**
     * Imprime todos los strings binarios que pueden ser formados substituyendo
     * un caracter comodin.
     * @param patron string que contiene el patrón a generar por substitución.
     * @param i índice en el patron desde el que generar.  
     */
    private static void imprimirStrBinariosRec(char[] patron, int i) {
        // caso base. si es el string vacio detenemos las llamadas recursivas y
        // volvemos de la función actual directamente.
        if (patron.length == 0) return;

        // caso base. si hemos llegado al final del string imprimimos la cadena
        // generada actualmente y se retorna desde la función actual.
        if (i == patron.length) {
            System.out.println(patron);
            return;
        }

        // comprobamos si el caracter actual que estamos procesando es un comodín
        if (patron[i] == COMODIN) {
            // si es un comodín generamos dos ramas de substitución.
            // una rama para el '0'. substituimos el comodín por un '0' y realizamos una 
            // llamada recursiva utilizando el patrón resultado de substituir
            patron[i] = '0';
            imprimirStrBinariosRec(patron, i + 1);
            
            // una rama para el '1'. substituimos el comodín por un '1' y realizamos una
            // llamada recursiva utilizando el patrón resultado de substituir
            patron[i] = '1';
            imprimirStrBinariosRec(patron, i + 1);

            // como los strings se generan sobre el mismo patrón, se vuelve a establecer
            // el carácter comodin después de procesar los distintos caminos
            patron[i] = COMODIN;
        } else {
            // si el caracter actual no es un comodin no hacemos nada y procesamos el substring
            // resultado de obviar el caracter actual
            imprimirStrBinariosRec(patron, i + 1);
        }
    }

    /** Método para ocultar la inicialización de la recursividad
     * este método recibe un String que será convertido a char[]
     * para el algoritmo recursivo.
     * @param str string que contiene el patrón de los strings a generar por substitución
     **/
    public static void imprimirStrBinarios(String str) {
        imprimirStrBinariosRec(str.toCharArray(), 0);
    }

    public static void main(String[] args) {
        // probamos el caso vacío. no debe imprimir nada
        System.out.println("String vacío: ");
        imprimirStrBinarios("");
        System.out.println("");        

        // probamos el patrón "1bb0bb1". se esperan 16 resultados
        System.out.println("String 1bb0bb1: ");
        imprimirStrBinarios("1bb0bb1");
        System.out.println(""); 
    }
}
