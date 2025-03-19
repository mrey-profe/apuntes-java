package es.iesteis;

public class Main {
    public static void main(String[] args) {
        Luz semaforo = new Luz();
        System.out.println(semaforo.getCor());
        for (int i = 0; i < 10; i++) {
            semaforo.cambio();
            System.out.println(semaforo);
        }
    }
}