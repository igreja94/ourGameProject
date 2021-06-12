package OurGame.Player.Cards.Normal;

import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bear extends NormalCard{

    public Bear() {
        super("Bear");

    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();
        Picture question = new Picture(550, 275, "BEAR M1.png");
        System.out.println("Entered action one! BEAR");
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
        Picture question = new Picture(550, 275, "BEAR M2.png");
        System.out.println("Entered action one! BEAR");
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
        Picture question = new Picture(550, 275, "BEAR M3.png");
        System.out.println("Entered action one! BEAR");
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
        Picture question = new Picture(550, 275, "BEAR M4.png");
        System.out.println("Entered action one! BEAR");
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
    public void actionSelected(int influence) { //25% per cent chance of flipping the changes
        int randomizer = (int) ((Math.random()*100)+1);

        if (randomizer < 20) {
            if (Game.isYes) {
                System.out.println("Consequences happen");
                Game.animalReputation = (Game.animalReputation - randomizeInfluence(influence));

            } else {
                System.out.println("Other consequences happen");
                Game.animalReputation = (Game.animalReputation + randomizeInfluence(influence));
            }
            return;
        }

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
        animalPicture = new Picture(670, 50, "BEAR.png");
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
