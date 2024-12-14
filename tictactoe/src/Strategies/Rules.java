package Strategies;

import Models.Board;
import Models.Move;

public interface Rules {
    boolean checkWinner(Board board, Move move);
}
