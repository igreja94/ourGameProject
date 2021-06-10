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
        Picture question = new Picture(550 , 275, "TIGER M1.png");
        System.out.println("Entered action one! TIGER");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println(Game.inputReceived);
                System.out.println("Loop broken");
                break;
            }
        }
        System.out.println("Loop broken");
        actionSelected(5);
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action one executed");
    }

    @Override
    public void actionTwo() {
        super.actionTwo();
        Picture question = new Picture(550, 275, "TIGER M2.png");
        System.out.println("Entered action one! TIGER");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(10);
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action two executed");

    }

    @Override
    public void actionThree() {
        super.actionThree();
        Picture question = new Picture(550, 275, "TIGER M4.png");
        System.out.println("Entered action one! TIGER");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(15);
        Game.inputReceived = false;
        question.delete();
        System.out.println("Action three executed");
    }

    @Override
    public void actionFour() {
        super.actionFour();
        Picture question = new Picture(550, 275, "TIGER M5.png");
        System.out.println("Entered action one! TIGER");
        question.draw();
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println("Loop broken");
                break;
            }
        }
        actionSelected(20);
        Game.inputReceived = false;
        question.delete();
        animalPicture.delete();
        System.out.println("Action four executed");
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
        animalPicture = new Picture(670, 50, "TIGER.jpg");
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
        int variation = 5;
        return (int) (Math.random() * (((influence+variation) - (influence-variation)) + 1) + (influence-variation));
    }
}

