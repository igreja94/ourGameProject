public class Game {

    private int peoplePower = 50;
    private boolean isDead;
    private int animalsInfluence;
    private int foodInfluence;
    private int hunterInfluence;


    public int getAnimalsInfluence() {
        return animalsInfluence;
    }

    public int getFoodInfluence() {
        return foodInfluence;
    }

    public int getHunterInfluence() {
        return hunterInfluence;
    }

    CardsFactory cardsFactory = new CardsFactory();


    private Card selectedCard;

    public Card drawACard() {
        int cardNumber = (int) (Math.random() * cardsFactory.getCardsInDeck().length);
        return cardsFactory.getCardsInDeck()[cardNumber];
    }

    public void getSelectedCard() {
        System.out.println(selectedCard.getName());
        System.out.println(selectedCard.getMessage());
    }


}
