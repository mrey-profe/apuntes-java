import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int totalAlumnos = 0;
        int totalAprobados = 0;
        int totalNotables = 0;
        int totalSobresalientes = 0;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Introduce la nota del alumno: ");
            double nota = teclado.nextDouble();
            totalAlumnos++;
            if (nota >= 5) {
                totalAprobados++;
                if (nota >= 9) {
                    totalSobresalientes++;
                } else if (nota >= 7) {
                    totalNotables++;
                }
            }
            System.out.println("¿Quieres introducir más notas? (s/n)");
            respuesta = teclado.next();
        } while (!respuesta.equals("n"));

        double porcentajeAprobados = (double) totalAprobados / totalAlumnos * 100;
        System.out.println("El porcentaje de aprobados es: " + porcentajeAprobados + "%");

        double porcentajeNotables = (double) totalNotables / totalAlumnos * 100;
        System.out.println("El porcentaje de notables es: " + porcentajeNotables + "%");

        double porcentajeSobresalientes = (double) totalSobresalientes / totalAlumnos * 100;
        System.out.println("El porcentaje de sobresalientes es: " + porcentajeSobresalientes + "%");
    }
}
