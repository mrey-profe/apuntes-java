package es.iesteis;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(10, 59);
        //Hora hora2 = new Hora(10, 60);
        hora.incrementarMinutos();
        hora.amosarHora();
    }
}
