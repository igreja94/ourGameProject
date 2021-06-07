package Cards;

import Cards.Normal.Warthog;
import Cards.Normal.Monkey;
import Cards.Normal.Tiger;
import Cards.Trap.TrapCard;

public class CardsFactory {
    //generates a random Trap by invoking TrapCard.randomizeTrapCard
    //else creates NormalCards according to probability
    public static Card generateCard() {
        int probability = (int) ((Math.random() *100) +1);

        if (probability <= 4) {
            return TrapCard.randomizeTrapCard();
        }

        if (probability <= 36) {
            return new Warthog();
        }

        if (probability <= 68) {
            new Tiger();
        }

        return new Monkey();
    }


}



