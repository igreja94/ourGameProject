public class Player {


    //PROPERTIES
    private String name;
    private int age = 18;
    private int maxAge = 60;
    private boolean isDead;



    //METHODS
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
