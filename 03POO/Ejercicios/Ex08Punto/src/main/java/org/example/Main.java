package org.example;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        System.out.println(p1);
        p1.moverPunto(1, 3);
        System.out.println(p1);
        Punto p2 = new Punto(3, 4);
        System.out.println(p2);
        Punto p3 = new Punto();
        System.out.println(p3);
        Linea l1 = new Linea(p1, p2);
        System.out.println(l1);
        l1.moverLinea(2, 3);
        System.out.println(l1);
        System.out.printf("Longitud: %.2f\n", l1.calcularLongitud());
    }
}