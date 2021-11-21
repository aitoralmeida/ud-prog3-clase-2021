
public class Ejercicio02 {

    /**
     * Imprime todos los números desde N hasta M
     * (ambos incluidos) en orden descendente.
     * Hace uso de la pila de llamadas para invertir
     * los números generados (se imprimen durante el
     * retorno de las llamadas recursivas).
     * @param n número inferior del rango a imprimir
     * @param m número superior del rango a imprimir.
     */
    public static void imprimirNumDesc(int n, int m) {
        //caso recursivo. si estamos dentro del rango
        if (n <= m) {
            // se imprime el siguiente número y después se imprime el actual
            imprimirNumDesc(n + 1, m);
            System.out.println(n);
        } // caso base. no continua la recursividad y no imprime nada
    }

    public static void main(String[] args) {
        imprimirNumDesc(5, 10);
    }
}