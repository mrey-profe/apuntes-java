import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Lee 3 números enteros por teclado.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        int numero3 = teclado.nextInt();
        if (numero1 <= 0 && numero2 <= 0 && numero3 <= 0) {
            int producto = numero1 * numero2 * numero3;
            System.out.println("El producto de los tres números es: " + producto);
        } else if (numero1 <= 0 || numero2 <= 0 || numero3 <= 0) {
            int suma = numero1 + numero2 + numero3;
            System.out.println("La suma de los tres números es: " + suma);
        } else {
            int resultado = (numero1 + numero2) * numero3;
            System.out.println("El resultado de la operación es: " + resultado);
        }
    }
}
