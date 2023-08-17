package book2.chapter2;

public class EnumTest2 {

    public enum CarsClub {BMW, TOYOTA,MAZDA}
    public static void main(String[] args)
    {
        CarsClub Club ;
        Club = CarsClub.BMW;
        System.out.println("The car is " + Club);
    }
}



