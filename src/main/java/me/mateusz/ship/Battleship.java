package me.mateusz.ship;

import me.mateusz.shared.Coordinate;

import java.util.List;

public class Battleship extends Ship {
    public Battleship(Orientation orientation, List<Coordinate> coordinates) {
        super(orientation, coordinates, 5);
    }
}

