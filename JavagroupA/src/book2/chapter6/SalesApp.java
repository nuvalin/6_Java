package book2.chapter6;

import java.util.Scanner;

public class SalesApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your class");
        String c = sc.nextLine();
        c = c.toLowerCase();
         char salesClass = c.charAt(0);
        double commissionRate;

        switch (salesClass)
        {

            case 'a':
                commissionRate = 0.02;
                break;

            case 'b':
                commissionRate = 0.035;
                break;

            case 'c':
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println("Your commission is" + commissionRate);

    }
}
