import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        final int INTENTOS = 5;
        int numero = (int) (Math.random() * 100) + 1;
        System.out.println("Adivina el número entre 1 y 100. Tienes " + INTENTOS + " intentos.");
        boolean adivinado = false;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < INTENTOS && !adivinado; i++) {
            System.out.println("Introduce un número: ");
            int intento = teclado.nextInt();
            if (intento == numero) {
                System.out.println("¡Enhorabuena! Has adivinado el número.");
                adivinado = true;
            } else if (intento < numero) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, se te han acabado los intentos y no has adivinado el número. El número era: " + numero);
        }

    }
}
