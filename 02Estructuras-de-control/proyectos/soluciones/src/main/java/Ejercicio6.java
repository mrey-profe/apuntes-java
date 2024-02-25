import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Lee horas, minutos y segundos y comprueba correctos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas: ");
        int horas = teclado.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos = teclado.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos = teclado.nextInt();
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            System.out.println("La hora introducida es correcta.");
            int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
            System.out.println("El total de segundos es: " + totalSegundos);
        } else {
            System.out.println("La hora introducida no es correcta.");
        }
    }
}
