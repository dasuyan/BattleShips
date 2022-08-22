package me.mateusz.board;

import me.mateusz.shared.Coordinate;
import me.mateusz.ship.Shot;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final int BOARD_SIZE = 10;
    public List<Coordinate> coordinates = new ArrayList<>();
    public Board() {
        for (int column = 'A'; column <= 'A' + BOARD_SIZE - 1; column++)
        {
            for (int row = 0; row < BOARD_SIZE; row ++)
            {
                this.coordinates.add(new Coordinate(Character.toString((char) column), row, Shot.NEUTRAL));
            }
        }
    }
    public void PrintBoard() {
        System.out.print("#" + " | ");
        for (int column = 'A'; column <= 'A' + BOARD_SIZE - 1; column++) {
            System.out.print((char) column + " | ");
        }

        int index = 0;
        for (int column = 'A'; column <= 'A' + BOARD_SIZE - 1; column++)
        {
            System.out.println();
            for (int row = 0; row < BOARD_SIZE; row++)
            {
                if (row == 0) System.out.print(index / 10 + " | ");
                System.out.print(coordinates.get(index).getState().label + " | ");
                index++;
            }
        }
    }
}
