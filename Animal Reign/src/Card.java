public class Card {
    //PROPERTIES

    private String name;
    private String message;




    //METHODS
    public Card(String name, String message) {
        this.name = name;
        this.message = message;
       // this.cardInfluence = cardInfluence;
    };

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
