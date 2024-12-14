package Strategies;

import Models.Board;
import Models.Cell;
import Models.CellState;
import Models.Move;

import java.util.List;

public class RowRule implements  Rules{
    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        List<List<Cell>> grid = board.getGrid();
        boolean result = true;
        for(int i = 0;i<3;i++){
            Cell currentCell = grid.get(row).get(i);
            if(currentCell.getState() == CellState.Empty){
                result = false;
            }
        }
        return result;
    }
}
