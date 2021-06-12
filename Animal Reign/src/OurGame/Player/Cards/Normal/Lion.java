package OurGame.Player.Cards.Normal;

import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Lion extends NormalCard{

    public Lion() {
        super("Lion");

    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();
        Picture question = new Picture(550, 275, "LION M1.png");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println(Game.inputReceived);
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(3);
        Game.inputReceived = false;
        question.delete();
        animalPicture.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionTwo() {
        super.actionTwo();
        Picture question = new Picture(550, 275, "LION M2.png");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println(Game.inputReceived);
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(6);
        Game.inputReceived = false;
        question.delete();
        animalPicture.delete();
        System.out.println("Action two executed");
    }

    @Override
    public void actionThree() {
        super.actionThree();
        Picture question = new Picture(550, 275, "LION M3.png");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println(Game.inputReceived);
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(9);
        Game.inputReceived = false;
        question.delete();
        animalPicture.delete();
        System.out.println("Action three executed");
    }

    @Override
    public void actionFour() {
        super.actionFour();
        Picture question = new Picture(550, 275, "LION M4.png");
        System.out.println("Entered action one! LION");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println(Game.inputReceived);
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(12);
        Game.inputReceived = false;
        question.delete();
        animalPicture.delete();
        System.out.println("Action four executed");
    }

    @Override
    public void actionSelected(int influence) {
        if (Game.isYes) {
            System.out.println("Consequences happen");
            Game.animalReputation = (Game.animalReputation + randomizeInfluence(influence));
        } else {
            System.out.println("Other consequences happen");
            Game.animalReputation = (Game.animalReputation - randomizeInfluence(influence));
        }
    }


    @Override
    public void cardSelected() {
        super.cardSelected();
        animalPicture = new Picture(670, 50, "LION.jpg");
        animalPicture.draw();
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

    public int randomizeInfluence(int influence){
        int variation = 3;
        return (int) (Math.random() * (((influence+variation) - (influence-variation)) + 1) + (influence-variation));
    }

}
