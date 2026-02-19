package org.example;

/**
 * Controller class that orchestrates the game flow.
 */
public class GameController {
    private Game game;
    private GameView view;

    public GameController() {
        view = new GameView();
    }

    /**
     * Starts and runs the game loop.
     */
    public void play() {
        view.showWelcome();

        String playerName = view.askPlayerName();
        game = new Game(playerName);

        view.showGreeting(playerName);

        do {
            // Get human player's choice as String from view
            String choiceValue = view.askPlayerChoice();

            // Controller creates the Choice object (model)
            Choice humanChoice = new Choice(choiceValue);

            // Play the round (sets choices for both players)
            game.playRound(humanChoice);

            // Show what each player chose
            view.showChoices(game.getHumanPlayer().getChoice(),
                    game.getComputerPlayer().getChoice());

            // Determine and show the winner
            String result = game.determineWinner();
            view.showRoundResult(result, game.getHumanPlayer().getName());

            // Show the scoreboard
            view.showScoreboard(game.getScoreboard());

        } while (!game.isGameOver());

        view.showFinalScore(game.getScoreboard(), game.hasPlayerWon());
    }
}