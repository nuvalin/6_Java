package book2.chapter8;

public class TestingException {
    public static void main(String[] args) {
        try {

            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception error) {
            System.out.println("error is " + error);
        }
    }
}
