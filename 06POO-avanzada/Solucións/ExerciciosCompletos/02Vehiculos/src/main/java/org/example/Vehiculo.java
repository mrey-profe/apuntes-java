package org.example;

import java.util.Objects;

public abstract class Vehiculo {
    private String modelo;
    private int numeroSerie;
    private TipoCombustible tipoCombustible;
    private double cargaCombustible;

    public Vehiculo(String modelo, int numeroSerie, TipoCombustible tipoCombustible) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.tipoCombustible = tipoCombustible;
        this.cargaCombustible = 0;
    }

    public Vehiculo(String modelo, int numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public double getCargaCombustible() {
        return cargaCombustible;
    }

    public abstract void mantenimiento();

    public void cargarCombustible() {
        System.out.printf("Se está repostando %s\n", TipoCombustible.DIESEL);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", numeroSerie=" + numeroSerie +
                ", tipoCombustible=" + tipoCombustible +
                ", cargaCombustible=" + cargaCombustible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return numeroSerie == vehiculo.numeroSerie;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroSerie);
    }
}
