package es.iesteis;

import java.util.Objects;

public class Flor {
    private String tipo;
    private String color;

    public Flor(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("Flor: " + tipo + ", Color: " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Flor flor)) return false;
        return Objects.equals(tipo, flor.tipo) && Objects.equals(color, flor.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, color);
    }
}
