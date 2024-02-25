import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un personaje de carnaval: ");
        String personaje = teclado.nextLine();
        switch (personaje) {
            case "pirata" -> System.out.println("Prepárate para surcar los siete mares.");
            case "princesa" -> System.out.println("¿¡Quién ha dicho que tenga que llevar vestido!?");
            case "vampiro" -> System.out.println("Prepara los colmillos.");
            case "bruja" -> System.out.println("Eu non creo nas meigas, pero habelas, hainas.");
            default -> System.out.println("No conozco ese personaje.");
        }
    }
}
