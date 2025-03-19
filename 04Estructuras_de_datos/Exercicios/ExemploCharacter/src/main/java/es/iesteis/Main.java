package es.iesteis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un programa que pida ao usuario un carácter e indique se está en maiúsculas
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Escribe un carácter");
//        char c = teclado.nextLine().charAt(0);
//        if (Character.isUpperCase(c)) {
//            System.out.println("É unha letra maiúscula");
//        } else if (Character.isLowerCase(c)){
//            System.out.println("É unha letra minúscula");
//        } else {
//            System.out.println("Non é maiúscula nin minúscula");
//        }
//        // Crear un programa que sume todos os números que introduza o usuario.
//        // Tras cada número se lle preguntará se quere seguir
//        // O usuario pode contestar en maiúsculas ou minúsculas s/n
//        // teclado.nextLine().charAt(0) ou teclado.next().charAt(0)
//        int suma = 0;
//        char resposta;
//        do {
//            System.out.println("Escribe un número enteiro");
//            int num = teclado.nextInt();
//            suma += num;
//            System.out.println("Continuar? s/n");
//            resposta = teclado.next().charAt(0);
//        } while (Character.toLowerCase(resposta) != 'n');
//        System.out.println("A suma é " + suma);

        String cadena1 = "Hola";
        String cadena2 = "Adiós";
        System.out.println(cadena1.compareTo(cadena2) > 0);
        int i = 5;
        boolean cond = true;
        System.out.printf("Un enteiro %5d, un booleano %b\n", i, cond);
        System.out.printf("PI vale %.5f", Math.PI);
    }
}