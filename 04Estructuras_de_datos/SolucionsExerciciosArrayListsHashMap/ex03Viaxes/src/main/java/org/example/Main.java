package org.example;

public class Main {
    public static void main(String[] args) {
        Axencia axencia = new Axencia("Axencia de Viaxes", "Av. de Bos Aires, 123");
        Destino destino1 = new Destino("París", "Francia");
        Destino destino2 = new Destino("Nova York", "EE.UU.");
        Destino destino3 = new Destino("Londres", "Reino Unido");
        Destino destino4 = new Destino("Marsella", "Francia");

        axencia.engadirDestino(destino1);
        axencia.engadirDestino(destino2);
        axencia.engadirDestino(destino3);
        axencia.engadirDestino(destino4);

        axencia.amosarDestinos();
        axencia.amosarDestinos("Francia");

        Viaxe viaxe1 = new Viaxe(destino1, 100.0, 30);
        Viaxe viaxe2 = new Viaxe(destino2, 200.0, 15);
        Viaxe viaxe3 = new Viaxe(destino3, 150.0, 10);

        Viaxeirx viaxeirx1 = new Viaxeirx("Juan", 30);
        Viaxeirx viaxeirx2 = new Viaxeirx("Ana", 25);
        Viaxeirx viaxeirx3 = new Viaxeirx("Pedro", 40);
        Viaxeirx viaxeirx4 = new Viaxeirx("María", 35);
        Viaxeirx viaxeirx5 = new Viaxeirx("Luis", 28);
        Viaxeirx viaxeirx6 = new Viaxeirx("Laura", 22);

        viaxe1.engadirViaxeirx(viaxeirx1);
        viaxe1.engadirViaxeirx(viaxeirx2);
        System.out.println("Viaxe 1: " + viaxe1);
        viaxe2.engadirViaxeirx(viaxeirx3);
        viaxe2.engadirViaxeirx(viaxeirx4);
        System.out.println("Viaxe 2: " + viaxe2);
        viaxe3.engadirViaxeirx(viaxeirx5);
        viaxe3.engadirViaxeirx(viaxeirx6);
        System.out.println("Viaxe 3: " + viaxe3);
        axencia.engadirViaxe(viaxe1);
        axencia.engadirViaxe(viaxe2);
        axencia.engadirViaxe(viaxe3);

        axencia.amosarViaxes();
        axencia.eliminarViaxe(1);
        axencia.amosarViaxes();

        axencia.amosarViaxes(destino1);
        axencia.amosarViaxes(destino2);

    }
}