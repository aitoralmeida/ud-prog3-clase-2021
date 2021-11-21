public class Ejercicio14 {

    /**
     * Calcula el valor de un elemento de la secuencia de Fibonnaci.
     * @param n índice del elemento de la secuencia de Fibonnaci, empezando en cero.
     * @return
     */
    private static int fibonnaci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
   
    public static void main(String[] args) {
        System.out.println("Fib(0) = " + fibonnaci(0));
        System.out.println("Fib(1) = " + fibonnaci(1));
        System.out.println("Fib(2) = " + fibonnaci(2));
        System.out.println("Fib(5) = " + fibonnaci(5));
        System.out.println("Fib(10) = " + fibonnaci(10));
    }
}
