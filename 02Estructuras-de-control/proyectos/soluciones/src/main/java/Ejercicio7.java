import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la primera fecha: ");
        System.out.println("Día: ");
        int dia1 = teclado.nextInt();
        System.out.println("Mes: ");
        int mes1 = teclado.nextInt();
        System.out.println("Año: ");
        int año1 = teclado.nextInt();
        System.out.println("Introduce la segunda fecha: ");
        System.out.println("Día: ");
        int dia2 = teclado.nextInt();
        System.out.println("Mes: ");
        int mes2 = teclado.nextInt();
        System.out.println("Año: ");
        int año2 = teclado.nextInt();
        if (año1 < año2) {
            System.out.println("La primera fecha es anterior a la segunda.");
        } else if (año1 > año2) {
            System.out.println("La primera fecha es posterior a la segunda.");
        } else { // Los años son iguales
            if (mes1 < mes2) {
                System.out.println("La primera fecha es anterior a la segunda.");
            } else if (mes1 > mes2) {
                System.out.println("La primera fecha es posterior a la segunda.");
            } else { // Los meses son iguales
                if (dia1 < dia2) {
                    System.out.println("La primera fecha es anterior a la segunda.");
                } else if (dia1 > dia2) {
                    System.out.println("La primera fecha es posterior a la segunda.");
                } else {
                    System.out.println("Las dos fechas son iguales.");
                }
            }
        }
    }
}
