package book3.chapter2.chapter1;

public class Actor {
    String firstName;
    String lastName;
    boolean isGood;


    public Actor(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }


    public Actor(String first, String last, boolean isGood) {
        this.firstName = first;
        this.lastName = last;
        this.isGood = isGood;
    }
}