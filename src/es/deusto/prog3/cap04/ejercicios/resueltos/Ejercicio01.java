
public class Ejercicio01 {

    /**
     * Imprime todos los números desde N hasta M
     * (ambos incluidos) en orden ascendente.
     * @param n número inferior del rango a imprimir
     * @param m número superior del rango a imprimir
     */
    public static void imprimirNumAsc(int n, int m) {
        // caso recursivo. si estamos dentro del rango
        if (n <= m) {
            // imprimir el número actual y llamar para imprimir el siguiente
            System.out.println(n);
            imprimirNumAsc(n + 1, m);
        } // caso base. no se imprime nada y se detiene la recursividad
    }

    public static void main(String[] args) {
        imprimirNumAsc(5, 10);
    }
 }