package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array1 = OperacionsArrays.arrayAleatorio(10);
        int[] array2 = OperacionsArrays.arrayAleatorio(9);

        System.out.println("Array 1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray 2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        try {
            int[] resultado = OperacionsArrays.sumaArrays(array1, array2);

            // Imprimir o resultado
            System.out.println("Resultado: ");
            for (int num : resultado) {
                System.out.print(num + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}