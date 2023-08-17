package book3.chapter2.chapter1;

import java.util.Scanner;

public class Init {


    public Scanner sc = new Scanner(System.in);
    public int x;

    {
        System.out.print(
                "Enter the starting value for x: ");
        x = sc.nextInt();
        System.out.println("you entered" + x);
    }

    public Init() {

        System.out.println(" constructor runing");

    }

}