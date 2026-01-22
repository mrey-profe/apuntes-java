package org.example;

public class Main {
    public static void main(String[] args) {
        Libro l = new Libro("A historia interminable","Michael Ende",3);
        Libro l2 = new Libro("Cantares Gallegos", "Rosalía de Castro");
        if (l.prestar()) {
            System.out.println("Libro prestado correctamente");
        } else {
            System.out.println("Non se puido prestar");
        }
        if (l2.devolver()) {
            System.out.println("O libro devolveuse correctamente");
        } else {
            System.out.println("Non había exemplares prestados");
        }
        if (l.devolver()) {
            System.out.println("O libro devolveuse correctamente");
        } else {
            System.out.println("Non había exemplares prestados");
        }
    }
}