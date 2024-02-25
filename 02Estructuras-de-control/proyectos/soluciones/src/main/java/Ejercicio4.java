import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el kilometraje en el repostaje anterior:");
        double kmAnteriorRepostaje = teclado.nextDouble();
        System.out.println("Introduce el kilometraje en el repostaje actual:");
        double kmActualRepostaje = teclado.nextDouble();
        System.out.println("Introduce los litros repostados:");
        double litrosRepostados = teclado.nextDouble();
        double consumo = (litrosRepostados / (kmActualRepostaje - kmAnteriorRepostaje)) * 100;
        System.out.println("El consumo medio es: " + consumo + " litros/100km");
    }

}
