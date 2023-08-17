package book2.chapter6;

import java.util.Scanner;

public class CarWashApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println
                ("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String b = sc.nextLine();
        b = b.toLowerCase();
        char p = b.charAt(0);
        String details = "";
        switch (p) {

            case 'e':
                details += "\tNew Car Scent, plus ... \n";

            case 'd':
                details += "\tTire Treatment, plus ... \n";

            case 'c':
                details +=
                        "\tLeather/Vinyl Treatment, plus ... \n";

            case 'b':
                details += "\tWax, plus ... \n";

            case 'a':
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
