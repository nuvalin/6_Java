package book3.chapter2.chapter1;

import java.util.Scanner;

class PrimeClass
{
    private Scanner  sc = new Scanner(System.in);
    public int x = getX();
    private int getX()
    {
        System.out.print("Enter the starting value "
                + "for x: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        PrimeClass pc = new PrimeClass();

    }
}
