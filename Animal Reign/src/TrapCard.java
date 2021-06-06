public class TrapCard extends Card implements TrapCards{
    //PROPERTIES
    private String name;
    private String message;


    //METHODS
    public TrapCard(String name, String message) {
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

}
