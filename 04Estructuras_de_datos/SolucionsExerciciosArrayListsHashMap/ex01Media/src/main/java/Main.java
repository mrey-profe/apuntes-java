import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        do {
            System.out.println("Introduce o valor dunha nota:");
            double nota = teclado.nextDouble();
            teclado.nextLine(); // Para limpar o retorno de carro
            notas.add(nota);
            System.out.println("Queres continuar? (non para rematar, calquera outra resposta para continuar)");
            resposta = teclado.nextLine();
        } while (!resposta.equalsIgnoreCase("non"));
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double media = suma / notas.size();
        System.out.printf("A media das notas é: %.2f", media);
    }
}
