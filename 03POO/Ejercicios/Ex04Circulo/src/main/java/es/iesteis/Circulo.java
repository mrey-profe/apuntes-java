package es.iesteis;

public class Circulo {
    private double radio;
    private String cor;

    public Circulo(double radio, String cor) {
        this.radio = radio;
        this.cor = cor;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", cor='" + cor + '\'' +
                '}';
    }

    public void amosarInformacion() {
        System.out.println(this);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
