package org.example;

public class AvionCarga extends Avion implements TransportadorMercancias{
    private int capacidadCarga;
    private int cargaActual;
    private String comandante;

    public AvionCarga(String modelo, int numeroSerie, TipoCombustible tipoCombustible, double consumo, int capacidadCarga, int cargaActual, String comandante) {
        super(modelo, numeroSerie, tipoCombustible, consumo);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
        this.comandante = comandante;
    }

    public AvionCarga(String modelo, int numeroSerie, double consumo, int capacidadCarga, int cargaActual, String comandante) {
        super(modelo, numeroSerie, consumo);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
        this.comandante = comandante;
    }

    @Override
    public void cargar() {
        cargaActual = capacidadCarga;
    }

    @Override
    public void descargar() {
        cargaActual = 0;
    }

    @Override
    public String toString() {
        return "AvionCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", cargaActual=" + cargaActual +
                ", comandante='" + comandante + '\'' +
                "} " + super.toString();
    }
}
