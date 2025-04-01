package org.example;

public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(Punto punto1, Punto punto2) {
        if (punto1.getX() != punto2.getX() && punto1.getY() != punto2.getY()) {
            this.punto1 = punto1;
            this.punto2 = punto2;
        } else {
            System.out.println("Os puntos non poden ser iguais");
        }
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public void moverLinea(int dx, int dy) {
        this.punto1.moverPunto(dx, dy);
        this.punto2.moverPunto(dx, dy);
    }

    public double calcularLongitud() {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }

    @Override
    public String toString() {
        return "Linea de " + punto1 + " a " + punto2;
    }
}
