package OurGame.Player.Cards.Trap;

import OurGame.Player.Game;
import OurGame.Player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pedro extends TrapCard{

    public Pedro() {
        super("Pedro");
    }

    @Override
    public void trapActionOne() {
        super.trapActionOne();
        mcString = new Picture(550 , 275, "MC PEDRO.png");
        mcString.draw();
        Player.killPlayer();
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
        System.out.println("Pedro Action 1 executed");
    }

    @Override
    public void trapActionTwo() {
        super.trapActionOne();
        mcString = new Picture(550 , 275, "MC PEDRO.png");
        mcString.draw();
        ageRandomizer();
        if (Player.age < 18){
            Player.age = 18;
        }
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
        System.out.println("Pedro Action 2 executed");
    }

    @Override
    public void cardSelected() {
        mcPicture = new Picture(670,50,"PEDRO.png");
        mcPicture.draw();
        actionRandomizer();
    }

    @Override
    public void actionRandomizer() {
        int randomize = (int) ((Math.random() * 100) + 1);

        if (randomize < 36) {
            trapActionOne();
            return;
        }
        trapActionOne();
    }

    public int ageRandomizer(){
        return (int) (Math.random() * (((20 - 5)) + 1) + (5));
    }


}
