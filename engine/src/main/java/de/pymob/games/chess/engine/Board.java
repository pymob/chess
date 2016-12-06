package de.pymob.games.chess.engine;

import de.pymob.games.chess.engine.enums.Alliance;
import de.pymob.games.chess.engine.enums.Position;
import de.pymob.games.chess.engine.figures.Figure;

import java.util.EnumMap;

public class Board implements IBoard {
    private final EnumMap<Position, Cell> map;

    public Board() {
        this.map = new EnumMap<>(Position.class);
    }

    @Override
    public Figure get(Position position) {
        Cell cell = map.get(position);
        return cell.isOccupied() ? cell.getFigure() : null;
    }

    @Override
    public Figure replace(Position position, Figure newFigure) {
        Cell oldCell = map.put(position, new Cell.OccupiedCell(newFigure));
        return oldCell.isOccupied() ? oldCell.getFigure() : null;
    }

    public boolean isLegalMove(Position from, Position to) {
        Cell fromCell = map.get(from);
        Cell toCell = map.get(to);
        Figure fromFigure = fromCell.getFigure();
        Figure toFigure = toCell.getFigure();
        Alliance fromAlliance = fromFigure.getAlliance();
        Alliance toAlliance = toFigure.getAlliance();
        // pre conditions
        if (!fromCell.isOccupied()) return false;  // empty cell
        if (fromAlliance.equals(toAlliance)) return false;  // same alliance

        if (!fromFigure.isValidPattern(XYZ)) {
            // TODO do stuff here
        }

        return false;
    }
}
