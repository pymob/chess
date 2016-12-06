package de.pymob.games.chess.engine.utils;

import de.pymob.games.chess.engine.enums.Alliance;

public class Parser {

    public static Alliance alliance(String of) {
        return Alliance.fromValue(of);
    }
}
