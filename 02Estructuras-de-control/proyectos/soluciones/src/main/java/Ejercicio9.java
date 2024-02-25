import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un número positivo: ");
            numero = teclado.nextInt();
        } while (numero < 0);
        System.out.println("El número introducido es: " + numero);
    }
}
