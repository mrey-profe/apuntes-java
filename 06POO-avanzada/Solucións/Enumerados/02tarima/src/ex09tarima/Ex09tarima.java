package ex09tarima;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Ex09tarima {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ancho = 0, lonxitude = 0;
        boolean anchoCorrecto = false;
        while (!anchoCorrecto) {
            System.out.println("Escribe anchura:");
            try {
                ancho = teclado.nextDouble();
                if (ancho > 0) {
                    anchoCorrecto = true;
                } else {
                    teclado.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Isto non é un double");
                teclado.nextLine();
            }
        }

        boolean lonxitudeCorrecta = false;
        while (!lonxitudeCorrecta) {
            System.out.println("Escribe lonxitude:");
            try {
                lonxitude = teclado.nextDouble();
                if (lonxitude > 0) {
                    lonxitudeCorrecta = true;
                } else {
                    teclado.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Isto non é un double");
                teclado.nextLine();
            }
        }

        teclado.nextLine();

        double superficie = ancho * lonxitude;
        int numCaixas = (int) (Math.ceil(superficie / 2.5));
        boolean madeiraCorrecta = false;
        Tarima madeira = null;
        while (!madeiraCorrecta) {
            System.out.println("Introduce tipo madeira (CARBALLO(40€), SAPELLY(50€),"
                    + " NOGUEIRA(60€), CERDEIRA(70€), BAMBU(100€):");
            String tipoMadeira = teclado.nextLine();
            try {
                madeira = Tarima.valueOf(tipoMadeira);
                madeiraCorrecta = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Non é un tipo de madeira correcto.");
            }
        }
        teclado.close();

        System.out.printf("Debes mercar %d caixas a %.2f€/caixa e gastarás "
                + "%.2f€.\n", numCaixas, madeira.getPrezoCaixa(),
                madeira.importePagar(numCaixas));
    }
}
