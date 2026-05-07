package ex02lexislador;

import java.util.ArrayList;

/**
 *
 * @author marta
 */
public class Ex02Lexislador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Lexislador> lexisladores = new ArrayList<>();
        lexisladores.add(new Deputado("Pontevedra", "Ecoloxistas", 10));
        lexisladores.add(new Senador("Cáceres", "Bla bla", 20));
        lexisladores.add(new Deputado("Ourense", "Partido Animalista", 15));
        lexisladores.add(new Senador("Ourense", "Partido Animalista", 17));
        
        for (Lexislador l : lexisladores) {
            System.out.println(l);
        }
    }

}
