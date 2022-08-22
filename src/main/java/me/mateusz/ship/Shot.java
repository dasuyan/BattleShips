package me.mateusz.ship;

public enum Shot {
    NEUTRAL ("~"),
    MISS ("?"),
    HIT ("X"),
    SUNK ("S");

    public final String label;

    Shot(String label) {
        this.label = label;
    }
}
