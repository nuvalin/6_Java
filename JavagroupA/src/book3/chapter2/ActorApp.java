package book3.chapter2.chapter1;

public class ActorApp {
    public static void main(String[] args) {
        Actor actor1 = new Actor( "Arnold" ,"Schwarzenegger" );
        Actor actor2 = new Actor( "Brad","Pitt", true);
        System.out.println(actor1.firstName +" is a bad actor" + actor1.isGood);
        System.out.println(actor2.firstName + "is a good actor" + actor2.isGood);

    }
}
