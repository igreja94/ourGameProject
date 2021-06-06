public class CardsFactory {

    private Card lionCard = new Card("Lion", "I've come eat!");
    private Card elephantCard = new Card("Elephant", "I'll remember everything and I don't like jamiroquai!");
    private Card monkey = new Card("Monkey", "I want food, I'm hungry. Can you give some bananaaaas??? ");
    private Card giraffe = new Card("Giraffe", "I lost my parents, can you give me a lair?");
    private Card sara = new Card("Sara", "Attention, Attention!!!!!  Claps For IGREJA!!!!! :D");
    private Card pedro = new Card("Pedro", "You only need to know 3 things about this...");
    private Card paulo = new Card("Paulo", "Animal of god!");


    private Card[] cardsInDeck = {lionCard, elephantCard, monkey, giraffe, sara, pedro, paulo};





    public Card[] getCardsInDeck() {
        return cardsInDeck;
    }
}



