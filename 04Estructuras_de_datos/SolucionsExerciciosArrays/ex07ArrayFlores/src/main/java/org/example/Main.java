package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Xardin xardin = new Xardin(3, 4);
        System.out.println(xardin);
        System.out.println("Contador de margaridas: " + xardin.contarFlores("margarida"));
        System.out.println(Arrays.deepToString(xardin.getFlores()));
    }
}