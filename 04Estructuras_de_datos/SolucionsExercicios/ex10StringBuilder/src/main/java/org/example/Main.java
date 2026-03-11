package org.example;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefghij");
        //Engadir * na posición 3.
        sb.insert(3, "*");
        //Substituír o carácter da posición 1 por #.
        sb.setCharAt(1, '#');
        //Eliminar o carácter da posición 2.
        sb.deleteCharAt(2);
        //Eliminar caracteres entre as posicións 5 e 8.
        sb.delete(5, 9);
        //Inverter os caracteres.
        sb.reverse();
        //Substituír caracteres en posicións pares por $.
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb.setCharAt(i, '$');
            }
        }
        //Converter o resultado final a String.
        String result = sb.toString();
        System.out.println(result);
    }
}