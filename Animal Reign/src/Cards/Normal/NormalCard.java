package Cards.Normal;

import Cards.Card;
import Cards.Normal.NormalBehaviour;

public class NormalCard extends Card implements NormalBehaviour {
    //PROPERTIES
    protected String message;
    protected String name;


    //METHODS
    public NormalCard(String name) {
        this.name = name;
    };

    public String getMessage() {
        return message;
    }

    @Override
    public String getName() {
        return name;
    }
    //needs 3 Strings: message + 2 reactions
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
}
