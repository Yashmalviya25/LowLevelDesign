package Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> grid;
    public Board() {
        grid = new ArrayList<List<Cell>>();
        for(int i = 0;i<3;i++){
            grid.add(new ArrayList<>());
            for(int j = 0;j<3;j++){
                grid.get(i).add(new Cell(i, j));
            }
        }
    }
    public List<List<Cell>> getGrid() {
        return grid;
    }

    /**
     * method to set grid
     * @param grid List<List<Cell>>
     */
    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public void  display(){
        for(List<Cell> row : grid){
            for(Cell cell : row){
                cell.displayCell();
            }
            System.out.println();
        }
    }
}
