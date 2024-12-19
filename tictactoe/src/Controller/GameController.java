package Controller;

import Models.Game;
import Models.GameState;
import Models.Player;
import Strategies.Rules;

import java.util.List;

public class GameController {
    public Game startGame(List<Player> players, List<Rules> rules) {
        try {
            return  Game.getBuilder()
                    .setPlayers(players)
                    .setRules(rules)
                    .build();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void display(Game game) {
        game.displayBoard();
    }
    public  void  makeMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
    
}
