package OurGame.Player;

import OurGame.Player.Cards.Card;
import OurGame.Player.Cards.CardsFactory;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game implements KeyboardHandler {

    public static int animalsInfluence = 50;
    private Card[] deck;
    private Player player;
    private Picture background;
    private int iterationsCompleted;
    public static boolean isYes;
    public static boolean inputReceived;

    public static boolean getIsIsYes() {
        return isYes;
    }

    public void setIsYes(boolean boo) {
        Game.isYes = boo;
    }


    public Game() {
        this.background = new Picture(10, 10, "BackgroundTwo.png");
        background.draw();

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
        keyboardInit();
        while (!(player.getIsDead()) && player.getAge() < player.getMaxAge()) {
            int randomize = (int) (Math.random() * deck.length);
            deck[randomize].cardSelected();
            iterationsCompleted++;
            if (iterationsCompleted == 2) {
                player.setAge((player.getAge() + 1));
                iterationsCompleted = 0;
                System.out.println("Iteration completed!");
            }
        }
        if (Game.animalsInfluence < 0) {
            //Game over screen from loss of influence
            System.out.println("Killed");
            player.killPlayer();
        }
        if (Game.animalsInfluence > 100) {
            //Game over from excess influence
            System.out.println("Killed");
            player.killPlayer();
        }
        if (player.getAge() > player.getMaxAge()){
            //Game over by natural causes
            System.out.println("Killed by test of time");
            player.killPlayer();
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT: //YES
                Game.inputReceived = true;
                System.out.println("Right key detected!");
                isYes = true;
                break;
            case KeyboardEvent.KEY_LEFT: //NO
                Game.inputReceived = true;
                System.out.println("Left key detected!");
                isYes = false;
                break;
            default:
                //animalPicture.translate(30, 0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void keyboardInit() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);
        keyboard.addEventListener(leftPressed);

    }
}
