package org.example;

public class PiezaDiferente extends Pieza{
    private int numeroConectores;

    public PiezaDiferente(Color color, int numeroDeSerie, int numeroConectores) {
        super(color, numeroDeSerie);
        this.numeroConectores = numeroConectores;
    }

    @Override
    public int getNumeroConectores() {
        return numeroConectores;
    }

    @Override
    public String toString() {
        return "PiezaDiferente{" +
                "numeroConectores=" + numeroConectores +
                "} " + super.toString();
    }
}
