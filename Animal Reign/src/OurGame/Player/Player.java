package OurGame.Player;

public class Player {


    //PROPERTIES
    private String name;
    public static int age = 18;
    public static final int maxAge = 50;
    public static boolean isDead;

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

    public static boolean killPlayer() {
        return isDead = true;
    }


}
