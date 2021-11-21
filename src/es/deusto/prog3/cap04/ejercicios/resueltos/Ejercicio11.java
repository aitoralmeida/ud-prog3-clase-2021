public class Ejercicio11 {

    // array con los valores hexadecimales de 0 a 15.
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /**
     * Método que convierte un número a su representación hexadecimal.
     * @param n número a convertir a hexadecimal
     * @return representación en hexadecimal del número pasado
     */
    private static String longAHexa(long n) {
        // caso base. si el número es 0, corresponde el string vacío
        if (n == 0) return "";

        int resto = (int) n % 16; // se obtiene el módulo de n entre la base
        // se construye el string resultado de concatenar el resultado de
        // aplicar la conversión al cociente de la división entre la base
        // con el valor hexadecimal correspondiente al resto actual
        return longAHexa(n / 16) + HEXADECIMAL[resto];
    }
    
    public static void main(String[] args) {
        System.out.println("0: " + longAHexa(0));
        System.out.println("30: " + longAHexa(30));
        System.out.println("100: " + longAHexa(100));
    }
}
