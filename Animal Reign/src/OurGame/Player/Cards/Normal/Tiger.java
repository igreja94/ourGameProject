package OurGame.Player.Cards.Normal;

import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Tiger extends NormalCard {

    public Tiger() {
        super("Tiger");
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();
        Picture question = new Picture(50, 50, "TIGER.jpg");
        System.out.println("Entered action one! TIGER");
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

    }

    @Override
    public void actionThree() {
        super.actionThree();

    }

    @Override
    public void actionFour() {
        super.actionFour();

    }

    @Override
    public void actionSelected() {
        super.actionSelected();
        if (Game.isYes) {
            System.out.println("Consequences happen");
        } else {
            System.out.println("Other consequences happen");
        }

    }

    @Override
    public void cardSelected() {
        super.cardSelected();
        animalPicture = new Picture(550, 85, "TIGER.jpg");
        animalPicture.draw();
        actionRandomizer();
    }

    @Override
    public void actionRandomizer() {
        int randomize = 1;

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

