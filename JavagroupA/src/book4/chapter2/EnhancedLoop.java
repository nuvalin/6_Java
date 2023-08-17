package book4.chapter2;

public class EnhancedLoop {
    public static void main(String[] args) {

        String[] daysOfWeek = getDaysOfWeek();
        //for (String day : daysOfWeek) {
        printStringArray(daysOfWeek);
       //     System.out.println(day);
        }



    public static String[] getDaysOfWeek() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days;

    }

    public static void printStringArray(String[] array) {
        for (String s : array)
            System.out.println(s);
    }
}