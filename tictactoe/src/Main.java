import Controller.GameController;
import Models.Game;
import Models.Player;
import Models.Symbol;
import Strategies.ColumnRule;
import Strategies.RowRule;
import Strategies.Rules;
import java.util.ArrayList;
import java.util.List;
import  Models.GameState;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
//        to start the game , what are the things that are required
//        size of the board
//        List of players
//        winning strategies
        List<Player> players = new ArrayList<>();
        players.add(new Player("Mohit" , new Symbol('X') ));
        players.add(new Player("Yash" , new Symbol('0') ));

//        Hey User do you want row winning rules ?

        List<Rules> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowRule());
        winningStrategies.add(new ColumnRule());
        Game game = gameController.startGame(players, winningStrategies);
        gameController.display(game);
        while(gameController.getGameState(game).equals(GameState.InProgress)) {
            gameController.makeMove(game);
            gameController.display(game);
        }
        if(gameController.getGameState(game).equals(GameState.Completed)){
            System.out.println("Winner: " + gameController.getWinner(game).getName());
        } else if(gameController.getGameState(game).equals(GameState.Draw)){
            System.out.println("Game has ended in a draw");
        }
    }
}