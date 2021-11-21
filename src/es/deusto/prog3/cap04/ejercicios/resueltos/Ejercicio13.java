public class Ejercicio13 {

    /**
     * Calcula el máximo común divisor de dos números enteros.
     * @param n número entero
     * @param m número entero
     * @return máximo común divisor de n y m
     */ 
    public static int mcd(int n, int m) {
        // caso base. si los dos números son iguales, cualquiera vale como resultado
        if (n == m) return n;

        // n > m: caso recursivo. n puede ser dividido por m
        if (n > m) return mcd(n - m, n);
        
        // m > n: caso recursivo. m puede ser dividido por n
        return mcd(n, m - n);
    }
    
    public static void main(String[] args) {
        System.out.println("MCD(60, 60) = " + mcd(60, 60));
        System.out.println("MCD(60, 48) = " + mcd(60, 48));
        System.out.println("MCD(13, 7) = " + mcd(13, 7));
    }
}
