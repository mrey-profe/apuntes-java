public class Ejercicio10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int suma_divisores = 1; // 1 es divisor de todos los números
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    suma_divisores += j;
                }
            }
            if (suma_divisores == i) {
                System.out.println(i + " es un número perfecto.");
            }
        }
    }
}
