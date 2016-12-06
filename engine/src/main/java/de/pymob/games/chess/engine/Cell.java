package de.pymob.games.chess.engine;

import de.pymob.games.chess.engine.figures.Figure;

public abstract class Cell {
    public abstract boolean isOccupied();
    public abstract Figure getFigure();

    public static class EmptyCell extends Cell {
        @Override
        public boolean isOccupied() {
            return false;
        }

        @Override
        public Figure getFigure() {
            return null;
        }
    }

    public static class OccupiedCell extends Cell {
        private Figure figure;

        public OccupiedCell(Figure figure) {
            this.figure = figure;
        }

        @Override
        public boolean isOccupied() {
            return true;
        }

        @Override
        public Figure getFigure() {
            return figure;
        }
    }
}
