package gal.iesteis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personaje p = new Personaje("Mario Bros", 1);
        Mago m = new Mago("Gandalf", 5, "Madera de roble");
        Guerrero g = new Guerrero("Conan", 10);

        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(p);
        personajes.add(m);
        personajes.add(g);

        for (Personaje personaje : personajes) {
            personaje.presentarse();
        }

        Personaje pers = new Guerrero("Conan", 10);
        pers.presentarse();
    }
}