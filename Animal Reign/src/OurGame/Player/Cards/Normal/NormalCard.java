package OurGame.Player.Cards.Normal;

import OurGame.Player.Cards.Card;
import OurGame.Player.Cards.Interfaces.NormalBehaviour;
import OurGame.Player.Game;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class NormalCard extends Card implements NormalBehaviour {
    //PROPERTIES

    protected String name;
    protected Rectangle cardRectangle;
    protected Picture animalPicture;
    protected Picture animalString;



    //METHODS
    public NormalCard(String name) {
        this.name = name;
        this.cardRectangle = cardRectangle;
        //Rectangle cardRectangle = new Rectangle(550, 70, 500, 700);
        //cardRectangle.fill();
    }

    ;

    public NormalCard() {
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public void actionOne() {

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

    public void actionSelected(int influence) {

    }

}
