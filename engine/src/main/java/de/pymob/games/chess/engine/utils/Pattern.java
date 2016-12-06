package de.pymob.games.chess.engine.utils;

import de.pymob.games.chess.engine.enums.Position;

import java.util.Arrays;
import java.util.List;

public abstract class Pattern {
    private List<Integer> positions;

    private Pattern(Integer... positions) {
        this.positions = Arrays.asList(positions);
    }

    public static class DIAGONAL extends Pattern {
        public DIAGONAL() {
            super(-7, -9, 7, 9);
        }
    }

    public static class HORIZONTAL extends Pattern {
        public HORIZONTAL() {
            super();
        }
    }

    public static class VERTICAL extends Pattern {

    }
}
