package org.example;

import java.util.Random;

/**
 * Model class that represents a choice in the Rock-Paper-Scissors game.
 */
public class Choice {
    private String value;

    public Choice(String value) {
        if (value.equals("ROCK") || value.equals("PAPER") || value.equals("SCISSORS")) {
            this.value = value;
        }
    }

    public String getValue() {
        return value;
    }

    /**
     * Determines if this choice beats another choice.
     * @param other The other choice to compare against.
     * @return true if this choice wins, false otherwise.
     */
    public boolean beats(Choice other) {
        if (this.value.equals("ROCK") && other.value.equals("SCISSORS")) {
            return true;
        }
        if (this.value.equals("PAPER") && other.value.equals("ROCK")) {
            return true;
        }
        if (this.value.equals("SCISSORS") && other.value.equals("PAPER")) {
            return true;
        }
        return false;
    }

    /**
     * Creates a random choice.
     * @return A new Choice object with a random value.
     */
    public static Choice getRandomChoice() {
        Random random = new Random();
        int number = random.nextInt(3);
        if (number == 0) {
            return new Choice("ROCK");
        }
        if (number == 1) {
            return new Choice("PAPER");
        }
        return new Choice("SCISSORS");
    }

    @Override
    public String toString() {
        return "Choice{" +
                "value='" + value + '\'' +
                '}';
    }
}