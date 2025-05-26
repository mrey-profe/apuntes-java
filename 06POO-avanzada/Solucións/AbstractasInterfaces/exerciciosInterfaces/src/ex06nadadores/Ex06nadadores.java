package ex06nadadores;

import java.util.ArrayList;

/**
 *
 * @author marta
 */
public class Ex06nadadores {

    public static void main(String[] args) {
        ArrayList<Nadador> lista = new ArrayList<>();

        lista.add(new Delfin());
        lista.add(new BaleaAzul(4));
        lista.add(new BaleaAzul(6));
        lista.add(new Triatleta());

        for (Nadador n : lista) {
            System.out.printf("Nada 1000m en %.2f\n", n.nadar(1000));
            if (n instanceof Ciclista) {
                System.out.printf("Percorre 10km en asfalto en %.2f segundos\n", 
                        ((Ciclista) n).percorrer(10, "asfalto"));
            }
            if (n instanceof Saltador s) {
                System.out.println("Saltou " + s.saltarAltura() + "cm");
            }
        }

    }
}
