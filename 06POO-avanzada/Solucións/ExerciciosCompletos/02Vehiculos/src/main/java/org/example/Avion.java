package org.example;

public class Avion extends Vehiculo implements Volador{
    private double consumo;

    public Avion(String modelo, int numeroSerie, TipoCombustible tipoCombustible, double consumo) {
        super(modelo, numeroSerie, tipoCombustible);
        this.consumo = consumo;
    }

    public Avion(String modelo, int numeroSerie, double consumo) {
        super(modelo, numeroSerie);
        this.consumo = consumo;
    }

    public final double maximaDistanciaRecorrer() {
        return super.getCargaCombustible() / consumo;
    }

    @Override
    public void mantenimiento() {
        System.out.println("Llamando mecánico");
    }

    @Override
    public void despegar() {
        System.out.println("Despegando...");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando");
    }
}
