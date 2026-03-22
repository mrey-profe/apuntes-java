package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantas notas quere introducir?");
        int n = teclado.nextInt();
        double[] notas = new double[n];
        // Creación do array de notas
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce unha nota:");
            notas[i] = teclado.nextDouble();
        }
        // Cálculo da media
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }
        double media = suma / n;
        System.out.printf("A media das notas é: %.2f", media);
    }
}