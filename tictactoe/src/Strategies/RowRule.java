package Strategies;

import Models.Board;
import Models.Move;

public class RowRule implements  Rules{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
