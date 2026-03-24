package org.example;

public class Main {
    public static void main(String[] args) {
        int[] pares = new int[100];
        int[] impares = new int[100];
        // Creación
        for (int i = 0; i < 100; i++) {
            pares[i] = 2 * i + 2;
            impares[i] = 2 * i + 1;
        }
//        int indice = 0;
//        for (int i = 2; i <= 200; i+=2) {
//            pares[indice] = i;
//            indice++;
//        }
//        indice = 0;
//        for (int i = 1; i <= 200; i+=2) {
//            impares[indice] = i;
//            indice++;
//        }
        // Mostrado por pantalla
        System.out.println("Los números pares son:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        System.out.println("Los números impares son:");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}