package book3.chapter7;

public class AnonClass {
    public static void main(String[] args) {
        Ball b = () -> System.out.println("you hit it");
        System.out.println("congrats");
        b. hit();

    }
}

interface  Ball {

     void hit();
}