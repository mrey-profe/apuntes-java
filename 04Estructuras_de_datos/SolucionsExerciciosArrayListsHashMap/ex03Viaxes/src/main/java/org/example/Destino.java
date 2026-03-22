package org.example;

import java.util.Objects;

public class Destino {
    private String lugar;
    private String pais;

    public Destino(String lugar, String pais) {
        this.lugar = lugar;
        this.pais = pais;
    }

    public String getLugar() {
        return lugar;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Destino destino))
            return false;
        Destino outro = (Destino) o;
        if (this.lugar.equals(outro.lugar) && this.pais.equals(outro.pais))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lugar, pais);
    }

    public String toString() {
        return lugar + ", " + pais;
    }
}
