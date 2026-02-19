package org.example;

import java.util.Scanner;

/**
 * View class that handles all user interaction.
 */
public class GameView {
    private Scanner scanner;

    // ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";

    // Emoji codes
    private static final String ROCK_EMOJI = "\u270A";      // ✊
    private static final String PAPER_EMOJI = "\u270B";     // ✋
    private static final String SCISSORS_EMOJI = "\u2702";  // ✂

    public GameView() {
        scanner = new Scanner(System.in);
    }

    /**
     * Displays the welcome message.
     */
    public void showWelcome() {
        System.out.println("=== Welcome to Rock-Paper-Scissors! ===");
        System.out.println("First to 3 points wins!\n");
    }

    /**
     * Greets the player by name.
     * @param playerName The name of the player.
     */
    public void showGreeting(String playerName) {
        System.out.println("Hello " + playerName + "! Let's play!\n");
    }

    /**
     * Asks the player for their name.
     * @return The player's name.
     */
    public String askPlayerName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    /**
     * Asks the player to choose rock, paper, or scissors.
     * @return The option selected by the player as a String ("ROCK", "PAPER", or "SCISSORS").
     */
    public String askPlayerChoice() {
        System.out.println("Choose your option:");
        System.out.println("1. Rock " + ROCK_EMOJI);
        System.out.println("2. Paper " + PAPER_EMOJI);
        System.out.println("3. Scissors " + SCISSORS_EMOJI);
        System.out.print("Enter 1, 2, or 3: ");

        int option = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        return switch (option) {
            case 1 -> "ROCK";
            case 2 -> "PAPER";
            default -> "SCISSORS";
        };
    }

    /**
     * Asks the player if they want to play again.
     * @return true if the player wants to continue, false otherwise.
     */
    public boolean askPlayAgain() {
        System.out.print("Do you want to play again? (y/n): ");
        String answer = scanner.nextLine();
        return answer.equals("y") || answer.equals("Y");
    }

    /**
     * Displays a message to the user.
     * @param message The message to display.
     */
    public void showMessage(String message) {
        System.out.println(message);
    }

    /**
     * Displays the choices made by both players.
     * @param humanChoice The human player's choice.
     * @param computerChoice The computer's choice.
     */
    public void showChoices(Choice humanChoice, Choice computerChoice) {
        System.out.println(CYAN + "You chose: " + humanChoice.getValue() + RESET);
        System.out.println(YELLOW + "Computer chose: " + computerChoice.getValue() + RESET);
    }

    /**
     * Displays the result of the round.
     * @param result The result code ("tie", "player", or "computer").
     * @param playerName The name of the human player.
     */
    public void showRoundResult(String result, String playerName) {
        if (result.equals("tie")) {
            System.out.println(YELLOW + "It's a tie!" + RESET);
        } else if (result.equals("player")) {
            System.out.println(GREEN + playerName + " wins this round!" + RESET);
        } else {
            System.out.println(RED + "Computer wins this round!" + RESET);
        }
    }

    /**
     * Displays the current scoreboard.
     * @param scoreboard The scoreboard string.
     */
    public void showScoreboard(String scoreboard) {
        System.out.println(BLUE + "Scoreboard: " + scoreboard + RESET);
        System.out.println();
    }

    /**
     * Displays the final score at the end of the game.
     * @param scoreboard The final scoreboard string.
     * @param playerWon true if the human player won, false if the computer won.
     */
    public void showFinalScore(String scoreboard, boolean playerWon) {
        System.out.println(GREEN + "\n=== Final Score ===" + RESET);
        System.out.println(GREEN + scoreboard + RESET);
        if (playerWon) {
            System.out.println(GREEN + "Congratulations! You won the game!" + RESET);
        } else {
            System.out.println(RED + "Computer wins the game!" + RESET);
        }
        System.out.println("Thanks for playing!");
    }
}