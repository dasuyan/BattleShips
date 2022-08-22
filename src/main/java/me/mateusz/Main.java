package me.mateusz;

import me.mateusz.board.Board;
import me.mateusz.shared.Coordinate;
import me.mateusz.ship.Battleship;
import me.mateusz.ship.Destroyer;
import me.mateusz.ship.Orientation;
import me.mateusz.ship.Shot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        List<Coordinate> coords1 = new ArrayList<>();
        Coordinate c1 = new Coordinate("A", 1);
        Coordinate c2 = new Coordinate("A", 2);
        Coordinate c3 = new Coordinate("A", 3);
        coords1.add(c1);
        coords1.add(c2);
        coords1.add(c3);

        List<Coordinate> coords2 = new ArrayList<>();
        Coordinate c4 = new Coordinate("A", 4);
        Coordinate c5 = new Coordinate("A", 5);
        Coordinate c6 = new Coordinate("A", 6);
        coords2.add(c4);
        coords2.add(c5);
        coords2.add(c6);

        Destroyer d1 = new Destroyer(Orientation.VERTICAL, coords1);
        Battleship b1 = new Battleship(Orientation.HORIZONTAL, coords2);

        /*System.out.println(coords1);
        System.out.println(coords2);*/

        System.out.println(d1.overlaps(b1));

        board.coordinates.get(99).setState(Shot.SUNK);
        System.out.println(board.coordinates.get(99).getState());

        System.out.println(board.coordinates.size());
        board.PrintBoard();
    }
}