package book2.chapter8;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
        }catch (ArithmeticException e) {

            System.out.println("Divede by zero error so made c zero");
        }
    }
}
