import Cards.Card;
import Cards.CardsFactory;
import Player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private int animalsInfluence = 50;
    private Card[] deck;
    private Player player;
    private Picture background;
    private int iterationsCompleted;

    public int getAnimalsInfluence() {
        return animalsInfluence;
    }

    public Game() {
        this.background = new Picture(10, 10, "BackgroundTwo.png");
        background.draw();

    }

    public void setAnimalsInfluence(int animalsInfluence) {
        this.animalsInfluence = animalsInfluence;
    }


    public Card[] createDeck(int deckSize) {
        deck = new Card[deckSize];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = CardsFactory.generateCard();
            System.out.println(deck[i].getName());
        }
        return deck;
    }

    public void gameStart(Card[] deck, Player player) {
        while (!player.getIsDead() || player.getAge() < player.getMaxAge()) {
            int randomize = (int) (Math.random() * deck.length);
            deck[randomize].cardSelected();
            iterationsCompleted++;
            if (iterationsCompleted == 2) {
                player.setAge((player.getAge() + 1));
                iterationsCompleted = 0;
            }
        }
    }
}
