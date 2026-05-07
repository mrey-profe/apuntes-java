package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public abstract class Pieza implements Conectable {
    private Color color;
    private int numeroDeSerie;
    private ArrayList<Pieza> piezasConectadas;

    public Pieza(Color color, int numeroDeSerie) {
        this.color = color;
        this.numeroDeSerie = numeroDeSerie;
        piezasConectadas = new ArrayList<>();
    }

    public abstract int getNumeroConectores();

    @Override
    public boolean conectar(Pieza p) {
        if (piezasConectadas.size() < getNumeroConectores()) {
            piezasConectadas.add(p);
            return true;
        }
        return false;
    }

    @Override
    public boolean retirar(String numeroSerie) {
        Iterator<Pieza> iterador = piezasConectadas.iterator();
        boolean encontrado = false;

        while (iterador.hasNext()) {
            Pieza p = iterador.next();
            if (p.numeroDeSerie == Integer.parseInt(numeroSerie)) {
                iterador.remove();
                encontrado = true;
            }
        }
        return encontrado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pieza pieza)) return false;
        return numeroDeSerie == pieza.numeroDeSerie;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroDeSerie);
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "color=" + color +
                ", numeroDeSerie=" + numeroDeSerie +
                ", piezasConectadas=" + piezasConectadas +
                '}';
    }
}
