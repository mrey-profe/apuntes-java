package org.example;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        if (base <= 0) {
            this.base = 1;
            System.out.println("O tamaño da base debe ser positivo");
        } else {
            this.base = base;
        }
        if (altura <= 0) {
            this.altura = 1;
            System.out.println("O tamaño da altura debe ser positivo");
        } else {
            this.altura = altura;
        }
    }

    public boolean esCuadrado(){
        return base==altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura= altura;
    }

}
