package es.iesteis;

public class Main {
    public static void main(String[] args) {
        Persoa p = new Persoa("Ana", 25, 'E', 60, 167);
        System.out.println(p);
        System.out.println(p.calcularIMC());
        System.out.printf("O IMC é %.2f\n", p.calcularIMC());
    }
}