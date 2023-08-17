package book3.chapter5;

public class TestBalls implements PlayableBall {


    @Override
    public void throwBall() {
        System.out.println("throwing ball");
    }

    @Override
    public void kickBall() {
        System.out.println("kicking ball");

    }

    @Override
    public void catchBall() {
        System.out.println("catching ball");
    }

    @Override
    public void dropBall() {
        System.out.println("droping ball");
    }

    public static void main(String[] args) {
        TestBalls t = new TestBalls();
        t.catchBall();
        t.dropBall();
        t.kickBall();
        t.throwBall();
    }


    }

