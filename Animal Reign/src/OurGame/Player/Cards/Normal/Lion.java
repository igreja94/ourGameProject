package OurGame.Player.Cards.Normal;

import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Lion extends NormalCard{

    public Lion() {
        super("Lion");
        animalPicture = new Picture(550, 85, "LION.jpg");
        animalPicture.draw();

    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();
        Picture question = new Picture(50, 50, "LION.jpg");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println("Still in loop");
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected();
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionTwo() {
        super.actionTwo();
        Picture question = new Picture(50, 50, "LION.jpg");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println("Still in loop");
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected();
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionThree() {
        super.actionThree();
        Picture question = new Picture(50, 50, "LION.jpg");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println("Still in loop");
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected();
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionFour() {
        super.actionFour();
        Picture question = new Picture(50, 50, "LION.jpg");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println("Still in loop");
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected();
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionSelected() {
        super.actionSelected();
    }


    @Override
    public void cardSelected() {
        super.cardSelected();
        animalString = new Picture();
        actionRandomizer();
    }

    @Override
    public void actionRandomizer() {
        int randomize = (int) ((Math.random() * 4) + 1);

        switch (randomize) {
            case 1:
                actionOne();
                break;
            case 2:
                actionTwo();
                break;
            case 3:
                actionThree();
                break;
            case 4:
                actionFour();
                break;
            default:
                System.out.println("Something unexpected happened!");
        }

    }
}
