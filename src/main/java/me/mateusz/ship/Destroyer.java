package me.mateusz.ship;

import me.mateusz.shared.Coordinate;

import java.util.List;

public class Destroyer extends Ship {

    public Destroyer(Orientation orientation, List<Coordinate> coordinates) {
        super(orientation, coordinates, 4);
    }
}
