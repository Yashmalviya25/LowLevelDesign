package Models;

public class Cell {
    private int row;
    private   int col;
    private CellState state;
    private Symbol symbol;
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.state = CellState.Empty;
        this.symbol = null;
    }

    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public CellState getState() {
        return state;
    }
    public void setState(CellState state) {
        this.state = state;
    }
}
