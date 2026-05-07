package org.example;

public class Main {
    public static void main(String[] args) {
        Pieza p1 = new PiezaBasica(Color.AZUL, 1, 2, 3, 4);
        Pieza p2 = new PiezaBasica(Color.AMARILLO, 2, 1, 1, 1);
        Pieza p3 = new PiezaBasica(Color.NEGRO, 3, 3, 4, 6);
        Pieza p4 = new PiezaBasica(Color.ROJO, 4, 2, 2, 1);
        Pieza p5 = new PiezaDiferente(Color.AMARILLO, 5, 6);
        Pieza p6 = new PiezaDiferente(Color.AMARILLO, 6, 4);
        Pieza p7 = new PiezaDiferente(Color.AMARILLO, 7, 3);
        Pieza p8 = new PiezaDiferente(Color.AMARILLO, 8, 2);
        Pieza p9 = new PiezaDiferente(Color.AMARILLO, 9, 7);
        System.out.println(p4.getNumeroConectores());
        System.out.println(p4.conectar(p8));
        System.out.println(p4.conectar(p1));
        System.out.println(p4.conectar(p2));
        System.out.println(p4.conectar(p5));
        System.out.println(p4.conectar(p9));

        Juguete j = new Juguete("Casa", "Friends", 4);
        j.anhadirPiezas(p1, 5);
        j.anhadirPiezas(p2, 2);
        j.anhadirPiezas(p4, 6);
        j.anhadirPiezas(p1, 3);

        System.out.println(j);
        j.mostrarPiezas();

    }
}