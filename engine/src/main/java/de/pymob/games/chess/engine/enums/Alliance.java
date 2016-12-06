package de.pymob.games.chess.engine.enums;

public enum Alliance {
    BLACK("B"), WHITE("W");

    private final String value;

    Alliance(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Alliance fromValue(String value) {
        for (Alliance alliance : Alliance.values()) {
            if (alliance.getValue().equals(value)) {
                return alliance;
            }
        }
        return null;
    }
}
