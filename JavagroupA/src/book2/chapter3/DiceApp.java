package book2.chapter3;

public class DiceApp {

    public static void main(String[] args) {

        int roll;
        System.out.println("Here are 100 random rolls of the dice:");
        for (int i = 0; i < 100; i++) {
            roll = randomNum(1, 6);
            System.out.print(roll + " ");
        }
        System.out.println();
    }

    public static int randomNum(int low, int high) {
        int result = (int)(Math.random() * (high - low + 1)) + low;
        return result;
    }
}
