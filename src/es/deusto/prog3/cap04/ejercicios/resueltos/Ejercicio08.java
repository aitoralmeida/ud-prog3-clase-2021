public class Ejercicio08 {

    /**
     * Calcula el cociente resultado de efectuar la división entre dos números positivos.
     * @param a dividendo de la división
     * @param b divisor de la división
     * @return cociente de la división
     */
    public static int calcularCociente(int a, int b) {
        // caso recursivo. el dividendo es mayor o igual que el divisor
        // se continua dividiendo el resultado de restar el divisor al dividendo
        // el resultado devuelto por la función se incrementa en 1.
        if (a >= b) return 1 + calcularCociente(a - b, b);
        
        return 0; // caso base. el divisor es mayor que el dividendo
    }
    
    public static void main(String[] args) {
        System.out.format("15 / 2 = %d%n", calcularCociente(15, 2));
        System.out.format("15 / 4 = %d%n", calcularCociente(15, 4));
        System.out.format("15 / 3 = %d%n", calcularCociente(15, 3));
        System.out.format("15 / 15 = %d%n", calcularCociente(15, 15));
        System.out.format("0 / 4 = %d%n", calcularCociente(0, 4));
    }
}
