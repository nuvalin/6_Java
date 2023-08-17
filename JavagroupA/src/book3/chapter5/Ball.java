package book3.chapter5;

public  abstract class Ball {
    public abstract  void hit(int batSpeed);

    public static void main(String[] args) {
 //       BaseBall  b = new BaseBall();
   //     System.out.println(b.hit(200));
        BallFactory bf = new BallFactory();
        Ball Ball1 = bf.getBall(  "baseball");
        Ball Ball2 = bf.getBall ("softball");
        Ball1.hit(100);
        Ball2.hit(200);

    }
}

 class BaseBall extends Ball{

    public void hit(int batSpeed) {
        System.out.println( " baseball is going at the speed of" + batSpeed);
    }

    }

class SoftBall extends Ball{

    public void hit(int batSpeed) {
        System.out.println( " softball is going at the speed of" + batSpeed);
    }

}
