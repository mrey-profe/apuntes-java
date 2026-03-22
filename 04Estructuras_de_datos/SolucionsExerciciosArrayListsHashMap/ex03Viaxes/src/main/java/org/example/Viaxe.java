package org.example;

import java.util.ArrayList;

public class Viaxe {
    private static int contador = 0;
    private int codigo;
    private Destino destino;
    private double prezo;
    private int numeroDias;
    private ArrayList<Viaxeirx> viaxeirxs;

    public Viaxe(Destino destino, double prezo, int numeroDias) {
        this.destino = destino;
        this.prezo = prezo;
        this.numeroDias = numeroDias;
        this.viaxeirxs = new ArrayList<>();
        this.codigo = contador++; // Asigno o contador e o incremento para a viaxe seguinte
    }

    public void engadirViaxeirx(Viaxeirx viaxeirx) {
        viaxeirxs.add(viaxeirx);
    }

    public Destino getDestino() {
        return destino;
    }

    public double getPrezo() {
        return prezo;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public int getCodigo() {
        return codigo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Viaxe ").append(codigo).append(": ");
        sb.append("Destino: ").append(destino).append(", ");
        sb.append("Prezo: ").append(prezo).append(", ");
        sb.append("Número de días: ").append(numeroDias).append(", ");
        sb.append("Viaxeirxs: \n");
        for (Viaxeirx viaxeirx : viaxeirxs) {
            sb.append(viaxeirx).append("\n");
        }
        return sb.toString();
    }
}
