package org.example;

public class Main {
    public static void main(String[] args) {
        Choice eleccion1 = new Choice("PAPER");
        Choice eleccion2 = new Choice("ROCK");

//        if (eleccion1.beats(eleccion2)) {
//            System.out.println("Gaña o xogador 1");
//        } else if (eleccion2.beats(eleccion1)){
//            System.out.println("Gaña xogador 2");
//        } else {
//            System.out.println("Empatan");
//        }

        Choice eleccion3 = Choice.getRandomChoice();

        Player human = new Player("Pepito");
        System.out.println(human.getName());
        System.out.println(human.getScore());
        human.setChoice(eleccion2);
        human.addPoint();
        System.out.println(human.getScore());
        System.out.println(human);
    }
}