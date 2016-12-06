package de.pymob.games.chess.engine;

public class Game implements IGame {

    public Game() {
        this("", "W");
    }

    public Game(String composition, String allianceToMove) {

    }

    @Override
    public boolean makeMove(String from, String to) {
        // check if player has the turn
        // check is legal move
        // perform move
        return false;
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
