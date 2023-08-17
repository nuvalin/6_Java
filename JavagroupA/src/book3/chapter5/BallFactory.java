package book3.chapter5;

class BallFactory {
    public static Ball getBall(String b) {
        if (b.equalsIgnoreCase("BaseBall"))
            return new BaseBall();
        if (b.equalsIgnoreCase("SoftBall"))
            return new SoftBall();
        return null;
    }
}
