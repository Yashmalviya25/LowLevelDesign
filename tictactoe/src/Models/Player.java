package Models;

import java.util.Scanner;

public class Player {
    private String name;
    private Symbol symbol;
    private Scanner scanner;
    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }
    public Symbol getSymbol() {
        return symbol;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public  Move makeMove(Board board) {
        System.out.println("Please enter the row in which you want to make the move");
        int row = scanner.nextInt();
        System.out.println("Please enter the column in which you want to make the move");
        int column = scanner.nextInt();

//        if you are validating the move here, in that case you can use actual cell

        return new Move(new Cell(row, column) , this);
    }
}
