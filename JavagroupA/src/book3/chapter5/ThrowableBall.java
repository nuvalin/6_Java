package book3.chapter5;

public interface ThrowableBall {
    void throwBall();
    void catchBall();

}
 interface KickableBall
{
    void kickBall();
    void catchBall();
}

 interface PlayableBall
        extends ThrowableBall, KickableBall
{
    void dropBall();
}