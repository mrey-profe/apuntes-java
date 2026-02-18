package es.iesteis;

public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(3, 4);
        r.amosarInformacion();
        r.setBase(45);
        r.amosarInformacion();
        System.out.println("Altura: "+r.getAltura());
    }
}