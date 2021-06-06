public class Player {


    //PROPERTIES
    private String name;
    private int age = 18;
    private int maxAge = 60;
    private boolean isDead;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

     public boolean getIsDead() {
       return isDead;
     }




    // METHODS
    public boolean killPlayer() {
        return isDead = true;
    }
}
