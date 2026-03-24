package org.example;

import java.util.Arrays;

public class Flor {
    private String tipo;
    private String cor;
    private static final String[] TIPOS = new String[]{"margarida", "rosa", "xirasol", "tulipan"};
    private static final String[] CORES = new String[]{"vermella", "rosa", "amarela", "branca"};

    public Flor(String tipo, String cor) {
        if (comprobarNome(tipo)) {
            this.tipo = tipo;
        }
        if (comprobarCor(tipo)) {
            this.cor = cor;
        }
    }

    private boolean comprobarNome(String nome) {
        return !nome.isEmpty() && Arrays.binarySearch(TIPOS, nome) >= 0;
    }

    public boolean comprobarCor(String cor) {
        return !cor.isEmpty() && Arrays.binarySearch(CORES, cor) >= 0;
    }

    public static String[] getCORES() {
        return CORES;
    }

    public static String[] getTIPOS() {
        return TIPOS;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return String.format("%s de cor %s", tipo, cor);
    }
}
