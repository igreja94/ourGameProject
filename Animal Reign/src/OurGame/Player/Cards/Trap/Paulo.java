package OurGame.Player.Cards.Trap;

import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Paulo extends TrapCard{

    public Paulo() {
        super("Paulo");
    }

    @Override
    public void trapActionOne() {
        super.trapActionOne();
        mcString = new Picture(550 , 275, "PAULO M1.png");
        mcString.draw();
        Game.animalReputation = (Game.animalReputation + 50);
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println(Game.inputReceived);
                System.out.println("Loop broken");
                break;
            }
        }
        Game.inputReceived = false;
        mcString.delete();
        mcPicture.delete();
        System.out.println("Paulo Action 1 executed");
    }

    @Override
    public void trapActionTwo() {
        super.trapActionOne();
        mcString = new Picture(550 , 275, "PAULO M1.png");
        mcString.draw();
        Game.animalReputation = (Game.animalReputation - 50);
        while (!Game.inputReceived) {
            System.out.println();
            if (Game.inputReceived) {
                System.out.println(Game.inputReceived);
                System.out.println("Loop broken");
                break;
            }
        }
        Game.inputReceived = false;
        mcString.delete();
        mcPicture.delete();
        System.out.println("Sara Action 2 executed");
    }

    @Override
    public void cardSelected() {
        mcPicture = new Picture(670, 50, "MC PAULO.png");
        mcPicture.draw();
        actionRandomizer();
    }


    @Override
    public void actionRandomizer() {
        int randomize = (int) ((Math.random() * 100) + 1);

        if (randomize < 51) {
            trapActionOne();
            return;
        }
        trapActionTwo();
    }


}
