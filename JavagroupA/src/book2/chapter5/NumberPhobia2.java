package book2.chapter5;

import java.util.Scanner;

public class NumberPhobia2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 2;
        String input = "y";
        while (input.equalsIgnoreCase( "y")) {
            System.out.println(number + "");
            System.out.print(" Answer 'Y' if you want to coutinue counting? ");
            input = sc.nextLine();
            number += 2;
        }
        System.out.println("YOU QUIT!");

    }

}

