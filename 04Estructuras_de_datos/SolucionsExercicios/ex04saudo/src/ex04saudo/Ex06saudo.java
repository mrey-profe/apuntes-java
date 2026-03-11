package ex04saudo;

import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Ex06saudo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String presentacion = teclado.nextLine();
        while (!presentacion.equalsIgnoreCase("Acabou a festa")) {
            //String nome = presentacion.substring(4);
            int indiceEspacio = presentacion.indexOf(" ");
            String nome = presentacion.substring(indiceEspacio + 1);
            System.out.println("Ola, " + nome);
            presentacion = teclado.nextLine();
        }
        teclado.close();
    }

}
