package de.pymob.games.chess.engine;

public interface IGame {
    boolean makeMove(String from, String to);
    boolean isGameOver();
}
