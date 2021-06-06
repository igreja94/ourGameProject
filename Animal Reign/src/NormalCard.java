public class NormalCard extends Card implements NormalCards{
    //PROPERTIES

    private String name;
    private String message;


    //METHODS
    public NormalCard(String name, String message) {
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
