package OurGame.Player.Cards.Trap;

import OurGame.Player.Cards.Card;
import OurGame.Player.Cards.Interfaces.TrapBehaviour;
import OurGame.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class TrapCard extends Card implements TrapBehaviour {
    //PROPERTIES
    protected String name;
    protected Rectangle cardRectangle;
    protected Picture mcPicture;
    protected Picture mcString;

    //METHODS
    public TrapCard(String name) {
        this.name = name;
        this.cardRectangle = cardRectangle;
        //Rectangle cardRectangle = new Rectangle(550, 70, 500, 700);
        //cardRectangle.fill();
    };


    @Override
    public String getName() {
        return name;
    }

    public static Card randomizeTrapCard(){
        int probability = (int) ((Math.random() *100) +1);
        if (probability <= 33) {
            return new Pedro();
        }
        if (probability <= 66) {
            return new Sara ();
        }
            return new Paulo();
    }



    @Override
    public void trapActionOne() {

    }

    @Override
    public void trapActionTwo() {

    }

    public void action(){

    };

}
