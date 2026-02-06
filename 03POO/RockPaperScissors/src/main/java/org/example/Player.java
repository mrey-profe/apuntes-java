package org.example;

/**
 * Model class that represents a player in the game.
 */
public class Player {
    private String name;
    private Choice choice;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public int getScore() {
        return score;
    }

    public void addPoint() {
        score++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", choice=" + choice +
                ", score=" + score +
                '}';
    }
}