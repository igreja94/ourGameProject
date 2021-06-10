package OurGame.Player.Cards.Normal;

import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Giraffe extends NormalCard{

    public Giraffe() {
        super("Giraffe");

    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();
        Picture question = new Picture(550, 275, "GIRAFFE M1.png");
        System.out.println("Entered action one! GIRAFFE");
        question.draw();
        while (!Game.inputReceived) {
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(5);
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionTwo() {
        super.actionTwo();
        Picture question = new Picture(550, 275, "GIRAFFE M2.png");
        System.out.println("Entered action one! GIRAFFE");
        question.draw();
        while (!Game.inputReceived) {
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(10);
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionThree() {
        super.actionThree();
        Picture question = new Picture(550, 275, "GIRAFFE M3.png");
        System.out.println("Entered action one! GIRAFFE");
        question.draw();
        while (!Game.inputReceived) {
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(15);
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionFour() {
        super.actionFour();
        Picture question = new Picture(550, 275, "GIRAFFE M4.png");
        System.out.println("Entered action one! GIRAFFE");
        question.draw();
        while (!Game.inputReceived) {
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(20);
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionSelected(int influence) {
        if (Game.isYes) {
            System.out.println("Consequences happen");
            Game.animalsInfluence = (Game.animalsInfluence + randomizeInfluence(influence));
        } else {
            System.out.println("Other consequences happen");
            Game.animalsInfluence = (Game.animalsInfluence - randomizeInfluence(influence));
        }
    }



    @Override
    public void cardSelected() {
        super.cardSelected();
        animalPicture = new Picture(670, 50, "GIRAFFE.jpg");
        animalPicture.draw();
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

    public int randomizeInfluence(int influence){
        int variation = 5;
        return (int) (Math.random() * (((influence+variation) - (influence-variation)) + 1) + (influence-variation));
    }

}
