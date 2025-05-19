package org.example;

import java.util.HashMap;

public class AvionComercial extends Avion {
    private int numeroPasajeros;
    private HashMap<String, String> tripulacion;

    public AvionComercial(String modelo, int numeroSerie, TipoCombustible tipoCombustible, double consumo, int numeroPasajeros) {
        super(modelo, numeroSerie, tipoCombustible, consumo);
        this.numeroPasajeros = numeroPasajeros;
        tripulacion = new HashMap<>();
    }

    public AvionComercial(String modelo, int numeroSerie, double consumo, int numeroPasajeros) {
        super(modelo, numeroSerie, consumo);
        this.numeroPasajeros = numeroPasajeros;
        tripulacion = new HashMap<>();
    }

    public void asignarTripulacion(String cargo, String nombre) {
        tripulacion.put(cargo, nombre);
    }

    @Override
    public String toString() {
        return "AvionComercial{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", tripulacion=" + tripulacion +
                "} " + super.toString();
    }
}
