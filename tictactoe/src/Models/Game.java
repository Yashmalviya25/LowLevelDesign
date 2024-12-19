package Models;

import Strategies.Rules;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private Player winner;
    private int currentPlayerIdx;
    private  GameState gameState;
    private List<Rules> rules;
    private List<Move> moves;

    public Game(List<Player> players,List<Rules> rules) {
        board = new Board();
        this.players = players;
        this.currentPlayerIdx = 0;
        this.gameState = GameState.InProgress;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.rules = rules;

    }

    public  Board getBoard() {
        return board;
    }
    public  void setBoard(Board board) {
        this.board = board;
    }

    public  List<Player> getPlayers() {
        return players;
    }
    public  void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getCurrentPlayerIdx() {
        return currentPlayerIdx;
    }
    public  void setCurrentPlayerIdx(Integer currentPlayerIdx) {
        this.currentPlayerIdx = currentPlayerIdx;
    }

    public  GameState getGameState() {
        return gameState;
    }

    public  void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }
    public  void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Rules> getRules() {
        return rules;
    }
    public  void setRules(List<Rules> rules) {
        this.rules = rules;
    }

    public Player getWinner() {
        return winner;
    }
    public  void setWinner(Player winner) {
        this.winner = winner;
    }

    public void displayBoard() {
        board.display();
    }

    public  static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    private boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || row >= 3 || col < 0 || col >= 3){
            return false;
        }

        return board.getGrid().get(row).get(col).getState().equals(CellState.Empty);
    }

    private void updateGameState(Move move, Player currentPlayer){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setState(CellState.Filled);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToChange);
        move.setPlayer(currentPlayer);
        moves.add(move);

        currentPlayerIdx++;
        currentPlayerIdx %= players.size();

//        Mohit Ayush Raman Kavya
    }
    private boolean checkWinner(Move move){
        for(Rules winningStrategy : rules){
            if(winningStrategy.checkWinner(board , move)){
                return true;
            }
        }
        return false;
    }

    public void makeMove() {
        Player player = players.get(currentPlayerIdx);
        System.out.println("It's " + player.getName() + "'s turn. Please make your move!");

        Move move =  player.makeMove(board);

        if(!validateMove(move)){
            System.out.println("This is invalid Move. Please try again!");
            return;
        }

        updateGameState(move, player);

        if(checkWinner(move)){
            winner = player;
            gameState = GameState.Completed;
        } else if (moves.size() == 3 * 3){
            gameState = GameState.Draw;
        }
    }


    /**
     * builder for creating object
     */
    public static class GameBuilder{
        private List<Player> players;
        private List<Rules> rules;

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public GameBuilder setRules(List<Rules> rules) {
            this.rules = rules;
            return this;
        }
        public Game build(){
            return  new Game(players,rules);
        }
    }
}
