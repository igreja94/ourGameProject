package OurGame.Player.Cards.Trap;

import OurGame.Player.Game;
import OurGame.Player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Sara extends TrapCard{

    public Sara() {
        super("Sara");
    }

    @Override
    public void trapActionOne() {
        super.trapActionOne();
        mcString = new Picture(550 , 275, "SARA M1.png");
        mcString.draw();
        Player.age = (Player.age + 10);
        Game.animalReputation = (Game.animalReputation + 30);
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
        System.out.println("Sara Action 1 executed");
    }

    @Override
    public void trapActionTwo() {
        super.trapActionOne();
        mcString = new Picture(550 , 275, "SARA M1.png");
        mcString.draw();
        Player.age = (Player.age - 10);
        if (Player.age < 18){
            Player.age = 18;
        }
        Game.animalReputation = (Game.animalReputation - 30);
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
        mcPicture = new Picture(670,50,"MC SARA.png");
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
