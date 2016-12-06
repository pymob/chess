package de.pymob.games.chess.engine;

import de.pymob.games.chess.engine.enums.Position;
import de.pymob.games.chess.engine.figures.Figure;

public interface IBoard {
    Figure get(Position position);
    Figure replace(Position position, Figure newFigure);
}
