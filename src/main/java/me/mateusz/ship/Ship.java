package me.mateusz.ship;

import me.mateusz.shared.Coordinate;

import java.util.List;

public abstract class Ship {
    public Orientation orientation;
    public List<Coordinate> coordinates;
    public final int SIZE;

    public Ship(Orientation orientation, List<Coordinate> coordinates, int SIZE) {
        this.orientation = orientation;
        this.coordinates = coordinates;
        this.SIZE = SIZE;
    }

    public void sink() {
        for (Coordinate coordinate : coordinates) {
            coordinate.setState(Shot.SUNK);
        }
    }

    public void isSunken() {
        for (Coordinate coordinate : coordinates) {
            if (coordinate.getState() != Shot.HIT) {
                return;
            }
        }
        sink();
        System.out.println("Ship is sunken");
    }

    public boolean overlaps(Ship ship) {
        for (Coordinate coordinate1 : coordinates)
        {
            for (Coordinate coordinate2 : ship.coordinates)
            {
                if (coordinate1.compareTo(coordinate2) == 0) return true;
            }
        }
        return false;
    }
}
