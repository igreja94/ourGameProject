package Cards.Normal;

import Cards.Card;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class NormalCard extends Card implements NormalBehaviour, KeyboardHandler {
    //PROPERTIES

    protected String name;
    protected Rectangle cardRectangle;
    protected Picture animalPicture;
    protected Picture animalString;
    protected boolean isYes;


    //METHODS
    public NormalCard(String name) {
        this.name = name;
        this.cardRectangle = cardRectangle;
        Rectangle cardRectangle = new Rectangle(550, 70, 500, 700);
        cardRectangle.draw();
    }

    ;

    public NormalCard() {
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public void actionOne() {

    }

    @Override
    public void actionTwo() {

    }

    @Override
    public void actionThree() {

    }

    @Override
    public void actionFour() {

    }

    public void executeActionYes() {

    }

    public void executeActionNo() {

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_RIGHT: //YES
            animalPicture.translate(30, 0);
                isYes = true;
                //executeActionYes();
                break;
            case KeyboardEvent.KEY_LEFT: //NO
                //executeActionNo();
                animalPicture.translate(-30, 0);
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
