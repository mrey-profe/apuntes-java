package es.iesteis;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(10, "vermella");
        c.amosarInformacion();
        c.setRadio(12);
        c.amosarInformacion();
        System.out.println("Cor: " + c.getCor());
    }
}