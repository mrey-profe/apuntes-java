package org.example;

public class PiezaBasica extends Pieza{
    private int alto;
    private int ancho;
    private int largo;

    public PiezaBasica(Color color, int numeroDeSerie, int alto, int ancho, int largo) {
        super(color, numeroDeSerie);
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public int getNumeroConectores() {
        return ancho * largo;
    }

    @Override
    public String toString() {
        return "PiezaBasica{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", largo=" + largo +
                "} " + super.toString();
    }
}
