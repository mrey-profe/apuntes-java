package gal.iesteis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Charmander(100, 20));
        pokemons.add(new Squirtle(100, 15));
        pokemons.add(new Charmander(130, 30));
        pokemons.add(new Squirtle(120, 25));

        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
            System.out.println("¿Está vivo? " + pokemon.estaVivo());
        }

        // Simulación de combate
        for (int i = 0; i < pokemons.size(); i++) {
            pokemons.get(i).atacar(pokemons.get((i + 1) % pokemons.size()));
        }

        // Mostrar el estado de los Pokémon después del combate
        System.out.println("\nEstado de los Pokémon después del combate:");
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
            System.out.println("¿Está vivo? " + pokemon.estaVivo());
//            if (pokemon instanceof Charmander charmander) {
//                charmander.voar();
//            }
            if (pokemon instanceof Charmander) {
                ((Charmander) pokemon).voar();
            }
        }
    }
}