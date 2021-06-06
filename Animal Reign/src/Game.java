public class Game {

    private int peoplePower = 50;
    private boolean isDead;
    private int animalsInfluence;
    private int foodInfluence;
    private int hunterInfluence;


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


    public NormalCard drawACard() {
        int cardNumber = (int) (Math.random() * cardsFactory.getCardsInDeck().length);
        return cardsFactory.getCardsInDeck()[cardNumber];
    }

    public void getSelectedCard() {
        System.out.println(selectedNormalCard.getName());
        System.out.println(selectedNormalCard.getMessage());
    }


}
