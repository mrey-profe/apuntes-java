package org.example;

import java.util.HashMap;

public class Juguete {
    private String nombre;
    private String serie;
    private HashMap<Pieza, Integer> piezas;
    private int edadRecomendada;

    public Juguete(String nombre, String serie, int edadRecomendada) {
        this.nombre = nombre;
        this.serie = serie;
        this.piezas = new HashMap<>();
        this.edadRecomendada = edadRecomendada;
    }

    public void anhadirPiezas(Pieza pieza, int cantidad) {
        if (piezas.containsKey(pieza)) {
            cantidad += piezas.get(pieza);
        }
        piezas.put(pieza, cantidad);
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", serie='" + serie + '\'' +
                ", piezas=" + piezas +
                ", edadRecomendada=" + edadRecomendada +
                '}';
    }

    public void mostrarPiezas() {
        for (Pieza pieza : piezas.keySet()) {
            System.out.println(pieza + " Cantidad: " + piezas.get(pieza));
        }
    }
}
