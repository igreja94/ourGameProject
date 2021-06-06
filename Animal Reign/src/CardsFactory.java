public class CardsFactory {

    private NormalCard lionNormalCard = new NormalCard("Lion", "I've come eat!");
    private NormalCard elephantNormalCard = new NormalCard("Elephant", "I'll remember everything and I don't like jamiroquai!");
    private NormalCard monkey = new NormalCard("Monkey", "I want food, I'm hungry. Can you give some bananaaaas??? ");
    private NormalCard giraffe = new NormalCard("Giraffe", "I lost my parents, can you give me a lair?");
    private TrapCard sara = new TrapCard("Sara", "Attention, Attention!!!!!  Claps For IGREJA!!!!! :D");
    private TrapCard pedro = new TrapCard("Pedro", "You only need to know 3 things about this...");
    private TrapCard paulo = new TrapCard("Paulo", "Animal of god!");


    private NormalCard[] cardsInDeck = {lionNormalCard, elephantNormalCard, monkey, giraffe, sara, pedro, paulo};

    public NormalCard[] getCardsInDeck() {
        return cardsInDeck;
    }
}



