package gal.iesteis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Flor f1 = new Flor("Rosa", "Vermella", 2.5);
        Flor f2 = new Flor("Lirio", "Branca", 3.0);
        Flor f3 = new Flor("Margarida", "Branca", 1.5);

        Persoa p1 = new Persoa("Jose", "Garcia", "987654321");
        Persoa p2 = new Persoa("Ana", "Lopez", "123456789");

        Ramo ramo1 = new Ramo(p1);

        ramo1.engadirFlor(f1);
        ramo1.engadirFlor(f2);
        ramo1.engadirFlor(f3);
        ramo1.engadirFlor(f1);
        System.out.println(ramo1);
        ramo1.eliminarFlores("lirio", "branca", 2);
        System.out.println(ramo1);

        ArrayList<Flor> flores = new ArrayList<>();
        flores.add(f1);

        Ramo ramo2 = new Ramo(flores, p2);
        System.out.println(ramo2);
    }
}