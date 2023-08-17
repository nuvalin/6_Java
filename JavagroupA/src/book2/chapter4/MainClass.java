package book2.chapter4;

public class MainClass {
    public static void main(String[] args) {
        int appleCount = 10;
        String msg = "You have " + appleCount + " apple"
                + ((appleCount > 1) ? "s." : ".");
        System.out.println(msg);
        String answer = "Yes";
        if (answer.equalsIgnoreCase("Yes"));
        {
            System.out.println("they are equal");
        }
    }
}



