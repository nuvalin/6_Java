package book3.chapter3;

public class StaticInit {

    public static int x;

    static {
        x = 32;
        System.out.println("x is " + x);
    }

    public StaticInit() {
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        System.out.println(StaticInit.x);
    }
}

