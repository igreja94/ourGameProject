package Cards.Trap;

import Cards.Card;

public class TrapCard extends Card implements TrapBehaviour {
    //PROPERTIES
    private String name;
    private String message;


    //METHODS
    public TrapCard(String name) {
        this.name = name;
    };

    public String getMessage() {
        return message;
    }

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

}
