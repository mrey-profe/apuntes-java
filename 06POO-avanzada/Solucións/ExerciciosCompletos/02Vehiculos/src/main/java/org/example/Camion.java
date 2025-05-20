package org.example;

public class Camion extends Vehiculo implements TransportadorMercancias {
    private int capacidadCarga;
    private int cargaActual;
    private int unidadCarga;
    private String conductor;

    public Camion(String modelo, int numeroSerie, TipoCombustible tipoCombustible, int capacidadCarga, int cargaActual, int unidadCarga, String conductor) {
        super(modelo, numeroSerie, tipoCombustible);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
        this.unidadCarga = unidadCarga;
        this.conductor = conductor;
    }

    public Camion(String modelo, int numeroSerie, int capacidadCarga, int cargaActual, int unidadCarga, String conductor) {
        super(modelo, numeroSerie);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
        this.unidadCarga = unidadCarga;
        this.conductor = conductor;
    }

    @Override
    public void cargar() {
        cargaActual = Math.min(capacidadCarga, cargaActual + unidadCarga);
    }

    @Override
    public void descargar() {
        cargaActual = Math.max(unidadCarga, cargaActual - unidadCarga);
    }

    @Override
    public void mantenimiento() {
        System.out.println("Llevando camión al taller");
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacidadCarga=" + capacidadCarga +
                ", cargaActual=" + cargaActual +
                ", unidadCarga=" + unidadCarga +
                ", conductor='" + conductor + '\'' +
                "} " + super.toString();
    }
}
