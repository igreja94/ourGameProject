package OurGame.Player;

import OurGame.Player.Cards.Card;
import OurGame.Player.Cards.CardsFactory;
import OurGame.Player.Sound.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game implements KeyboardHandler {

    public static int animalReputation = 50;
    private Card[] deck;
    private Player player;
    private Picture background;  //3
    private Picture storyMenu;  //2
    private Picture titleMenu;  //1

    private Sound music;
    private Sound gameOver;
    private Sound victory;
    private int iterationsCompleted;
    public static boolean isYes;
    public static boolean inputReceived;
    public static boolean changeScreen;


    public Game() {
        this.titleMenu = new Picture(10, 10, "OPEN.png");
        titleMenu.draw();
        music = new Sound("/jungle.wav");
        gameOver = new Sound("/lom.wav");
        victory = new Sound("/vic.wav");
        music.play(true);
        music.setLoop(5);
        keyboardInit();
    }

    public Card[] createDeck(int deckSize) {
        deck = new Card[deckSize];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = CardsFactory.generateCard();
            //deck[i] = CardsFactory.tester();
            System.out.println(deck[i].getName());
        }
        return deck;
    }

    public void gameStart(Card[] deck, Player player) {
        while (!Game.inputReceived) {
            System.out.println();

            if (Game.inputReceived) {
                titleMenu.delete();
                this.storyMenu = new Picture(10, 10, "intro.png");
                storyMenu.draw();
                inputReceived = false;

                while (!Game.inputReceived) {
                    System.out.println();

                    if (Game.inputReceived) {

                        storyMenu.delete();
                        this.background = new Picture(10,10, "backgroundFinal.png");
                        background.draw();

                        Text reputationScreen = new Text(163, 190, "Repute:" + animalReputation);
                        Text ageScreen = new Text(150, 110, "Age:" + player.getAge());

                        ageScreen.grow(80, 25);
                        ageScreen.setColor(Color.DARK_GRAY);
                        reputationScreen.grow(95, 30);
                        reputationScreen.setColor(Color.DARK_GRAY);
                        reputationScreen.draw();
                        ageScreen.draw();
                        Game.inputReceived = false;


                        while (!(player.getIsDead())) {
                            int randomize = (int) (Math.random() * deck.length);
                            deck[randomize].cardSelected();
                            reputationScreen.setText("Repute:" + animalReputation);
                            reputationScreen.draw();

                            if (Game.animalReputation <= 0) {
                                ageScreen.delete();
                                reputationScreen.delete();

                                //Game over screen from loss of influence
                                System.out.println("Killed by loss of influence");
                                this.background = new Picture(10, 10, "FINAL.png");
                                music.stop();
                                gameOver.play(true);
                                background.draw();
                                Player.killPlayer();
                                Game.inputReceived = true;

                            }

                            if (Game.animalReputation >= 100) {
                                //Game over from excess influence
                                ageScreen.delete();
                                reputationScreen.delete();

                                System.out.println("Killed by excess influence");
                                this.background = new Picture(10, 10, "FINAL.png");
                                music.stop();
                                gameOver.play(true);
                                background.draw();
                                Player.killPlayer();
                                Game.inputReceived = true;
                            }

                            if (Player.age >= Player.maxAge) {
                                //Game over by natural causes
                                ageScreen.delete();
                                reputationScreen.delete();

                                System.out.println("Killed by test of time");
                                this.background = new Picture(10, 10, "happyEnd.png");
                                music.stop();
                                victory.play(true);
                                victory.setLoop(2);
                                background.draw();
                                Player.killPlayer();
                                Game.inputReceived = true;
                            }

                            iterationsCompleted++;
                            if (iterationsCompleted == 2) {
                                player.setAge((player.getAge() + 1));
                                iterationsCompleted = 0;
                                ageScreen.delete();
                                ageScreen.setText("Age:" + player.getAge());
                                ageScreen.draw();
                            }
                        }
                        ageScreen.delete();
                        reputationScreen.delete();
                    }
                }
            }
        }
    }


        /*if (Game.animalReputation < 0) {
            //Game over screen from loss of influence
            System.out.println("Killed by loss of influence");
            this.background = new Picture(10, 10, "FINAL.png");
            background.draw();
            Player.killPlayer();
        }
        if (Game.animalReputation > 100) {
            //Game over from excess influence
            System.out.println("Killed by excess influence");
            this.background = new Picture(10, 10, "FINAL.png");
            background.draw();
            Player.killPlayer();
        }
        if (player.getAge() > player.getMaxAge()){
            //Game over by natural causes
            System.out.println("Killed by test of time");
            this.background = new Picture(10, 10, "FINAL.png");
            background.draw();
            Player.killPlayer();
        }*/


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
                changeScreen = true;
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
