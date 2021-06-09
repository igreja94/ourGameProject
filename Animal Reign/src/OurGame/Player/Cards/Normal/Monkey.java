package OurGame.Player.Cards.Normal;

import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Monkey extends NormalCard {


    public Monkey() {
        super("Monkey");


    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();
        Picture question = new Picture(50, 50, "MONKEY.jpg");
        System.out.println("Entered action one! MONKEY");
        question.draw();
        while (!Game.isInputReceived()) {
            if (Game.isInputReceived()) {
                break;
            }
        }
        actionSelected();
        Game.setInputReceived(false);
        question.delete();
        System.out.println("Action one executed");
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
        animalPicture = new Picture(550, 85, "MONKEY.jpg");
        animalPicture.draw();
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
