package org.example;

import java.util.Random;

public class OperacionsArrays {
    public static int[] arrayAleatorio(int n) {
        Random r = new Random();
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = 1 + r.nextInt(100); // nextInt devolve números de 0 a 99, se lle suma 1 para que vaia de 1 a 100
        }
        return resultado;
    }

    public static int[] sumaArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Os arrays deben ter a mesma lonxitude");
        } else {
            int[] resultado = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                resultado[i] = a[i] + b[i];
            }
            return resultado;
        }
    }
}
