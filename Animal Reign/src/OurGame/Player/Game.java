package OurGame.Player;

import OurGame.Player.Cards.Card;
import OurGame.Player.Cards.CardsFactory;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game implements KeyboardHandler {

    private int animalsInfluence = 50;
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

    public static boolean isInputReceived() {
        return inputReceived;
    }

    public static void setInputReceived(boolean inputReceived) {
        Game.inputReceived = inputReceived;
    }

    public int getAnimalsInfluence() {
        return animalsInfluence;
    }

    public void setAnimalsInfluence(int animalsInfluence) {
        this.animalsInfluence = animalsInfluence;
    }


    public Game() {
        this.background = new Picture(10, 10, "BackgroundTwo.png");
        background.draw();

    }



    public Card[] createDeck(int deckSize) {
        deck = new Card[deckSize];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = CardsFactory.tester();
            System.out.println(deck[i].getName());
        }
        return deck;
    }

    public void gameStart(Card[] deck, Player player) {
        while (player.getAge() < player.getMaxAge()) {
            keyboardInit();
            int randomize = (int) (Math.random() * deck.length);
            deck[randomize].cardSelected();
            iterationsCompleted++;
            if (iterationsCompleted == 2) {
                player.setAge((player.getAge() + 1));
                iterationsCompleted = 0;
                System.out.println("Iteration completed!");
            }
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT: //YES
                System.out.println("Right key detected!");
                isYes = true;
                Game.inputReceived = true;
                break;
            case KeyboardEvent.KEY_LEFT: //NO
                System.out.println("Left key detected!");
                isYes = false;
                Game.inputReceived = true;
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
