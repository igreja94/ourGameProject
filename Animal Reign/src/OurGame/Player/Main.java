package OurGame.Player;

import OurGame.Player.Game;
import OurGame.Player.Player;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player();
        game.gameStart(game.createDeck(100),player);

    }



}
