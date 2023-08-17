package book2.chapter3;

import java.text.NumberFormat;


public class NumberFormatClassApp {
    static NumberFormat cf =
            NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPaintBallGun();
    }

    public static void printMyAllowance() {
        double myAllowance = 1050;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: " + cf.format(myAllowance));
    }

    public static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 108.99;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: " + cf.format(costOfPaintBallGun));
    }
}
