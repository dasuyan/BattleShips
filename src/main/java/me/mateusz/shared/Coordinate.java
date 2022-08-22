package me.mateusz.shared;

import me.mateusz.ship.Shot;

import java.util.Comparator;

public class Coordinate implements Comparable<Coordinate> {

    public final String Column;
    public final int Row;
    public Shot state;

    public Coordinate(String Column, int Row) {
        this.Row = Row;
        this.Column = Column;
        this.state = Shot.NEUTRAL;
    }
    public Coordinate(String Column, int Row, Shot state) {
        this.Row = Row;
        this.Column = Column;
        this.state = state;
    }

    public String getColumn() {
        return Column;
    }

    public int getRow() {
        return Row;
    }

    public Shot getState() {
        return state;
    }

    public void setState(Shot state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "Column='" + Column + '\'' +
                ", Row=" + Row +
                ", state=" + state +
                '}';
    }

    @Override
    public int compareTo(Coordinate o) {
        return Comparator.comparing(Coordinate::getColumn)
                .thenComparing(Coordinate::getRow)
                .thenComparing(Coordinate::getState)
                .compare(this, o);
    }
}
