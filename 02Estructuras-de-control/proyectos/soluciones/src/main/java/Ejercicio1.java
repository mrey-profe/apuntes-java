import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        String respuesta;
        do {
            System.out.println("Introduce la nota del alumno: ");
            double nota = teclado.nextDouble();
            suma += nota;
            contador++;
            System.out.println("¿Quieres introducir más notas? (s/n)");
            respuesta = teclado.next();
        } while (respuesta.equals("s"));
        System.out.println("La nota media del alumno es: " + suma / contador);
    }
}
