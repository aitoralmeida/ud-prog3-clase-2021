class Ejercicio12 {

    /**
     * Calcula el factorial del número n entero mayor o igual que cero.
     * @param n número del que calcular el factorial
     * @return factorial del número n
     */
    private static int factorial(int n) {
        // caso base. por definición, factorial(0) es 1
        if (n == 0) return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("0! = " + factorial(0));
        System.out.println("1! = " + factorial(1));
        System.out.println("2! = " + factorial(2));
        System.out.println("5! = " + factorial(5)); 
    }
}