package book2.chapter7;

public class RandomNumbers {
    public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("NUMBER IS: " + number);
    }
    public static int getRandomNumber() {
        int num = (int) Math.floor(Math.random() * 10 + 1);
        return num;
    }

}
