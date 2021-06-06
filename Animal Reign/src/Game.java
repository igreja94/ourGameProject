import Cards.Card;
import Cards.CardsFactory;
import Cards.Normal.NormalCard;
import Player.Player;

public class Game {

    private int animalsInfluence = 50;
    private int foodInfluence = 50;
    private int hunterInfluence = 50;
    private Card[] deck;
    private Player player;

    public int getAnimalsInfluence() {
        return animalsInfluence;
    }

    public void setAnimalsInfluence(int animalsInfluence) {
        this.animalsInfluence = animalsInfluence;
    }

    public int getFoodInfluence() {
        return foodInfluence;
    }

    public void setFoodInfluence(int foodInfluence) {
        this.foodInfluence = foodInfluence;
    }

    public int getHunterInfluence() {
        return hunterInfluence;
    }

    public void setHunterInfluence(int hunterInfluence) {
        this.hunterInfluence = hunterInfluence;
    }

    public Card[] createDeck(int deckSize) {
        deck = new Card[deckSize];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = CardsFactory.generateCard();
            System.out.println(deck[i].getName());
        }
        return deck;
    }




}
