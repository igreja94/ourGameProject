package OurGame.Player.Cards;

import OurGame.Player.Cards.Normal.*;
import OurGame.Player.Cards.Trap.TrapCard;

public class CardsFactory {
    //generates a random Trap by invoking TrapCard.randomizeTrapCard
    //else creates NormalCards according to probability
    public static Card generateCard() {
      int probability = (int) ((Math.random() *100) +1);

        if (probability <= 4) {
            return TrapCard.randomizeTrapCard();
        }

        if (probability <= 10) {
            return new Warthog();
        }

        if (probability <= 21) {
            return new Tiger();
        }

        if (probability <= 32) {
            return new Rhino();
        }

        if (probability <= 43) {
            return new Lion();
        }

        if (probability <= 54) {
            return new Bear();
        }

        if (probability <= 64) {
            return new Crockdealer();
        }

        if (probability <= 74) {
            return new Zebra();
        }

        if (probability <= 85) {
            return new Giraffe();
        }

        return new Monkey();
    }

    public static Card tester(){
        return new Tiger();
    }


}



