package OurGame.Player;

public class Player {


    //PROPERTIES
    private String name;
    private int age = 18;
    private final int maxAge = 20;
    private boolean isDead;

    //METHODS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsDead() {
       return isDead;
     }

    public boolean killPlayer() {
        return isDead = true;
    }


}
