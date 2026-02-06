package org.example;

public class Game {
    private Player humanPlayer;
    private Player computerPlayer;
    private static final int WINNING_SCORE = 3;

    public Game(String playerName) {
        this.humanPlayer = new Player(playerName);
        this.computerPlayer = new Player("Computer");

    }

    public Player getHumanPlayer() {
        return humanPlayer;
    }

    public Player getComputerPlayer() {
        return computerPlayer;
    }

    /**
     * Checks if the game is over (a player reached the winning score).
     *
     * @return true if a player has won, false otherwise.
     */
    public boolean isGameOver() {
        return humanPlayer.getScore() >= WINNING_SCORE ||
                computerPlayer.getScore() >= WINNING_SCORE;
    }

    /**
     * Checks if the human player won the game.
     *
     * @return true if the human player won, false otherwise.
     */
    public boolean hasPlayerWon() {
        return humanPlayer.getScore() > computerPlayer.getScore() &&
                isGameOver();
    }

    /**
     * Sets the human player's choice and generates a random choice for the computer.
     *
     * @param humanChoice The choice made by the human player.
     */
    public void playRound(Choice humanChoice) {
        humanPlayer.setChoice(humanChoice);
        computerPlayer.setChoice(Choice.getRandomChoice());
    }

    /**
     * Determines the winner of the round and updates scores.
     *
     * @return "tie", "player", or "computer" indicating the result.
     */
    public String determineWinner() {
        Choice humanChoice = humanPlayer.getChoice();
        Choice computerChoice = computerPlayer.getChoice();

        if (humanChoice.getValue().equals(computerChoice.getValue())) {
            return "tie";
        }
        if (humanChoice.beats(computerChoice)) {
            humanPlayer.addPoint();
            return "player";
        }
        computerPlayer.addPoint();
        return "computer";
    }

    /**
     * Returns the current scoreboard.
     *
     * @return A string with the current scores.
     */
    public String getScoreboard() {
        return humanPlayer.getName() + ": " + humanPlayer.getScore() +
                " - " + computerPlayer.getName() + ": " + computerPlayer.getScore();
    }
}
