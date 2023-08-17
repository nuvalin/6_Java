package book3.chapter6;

public class CloneTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Nuvalin","Moodley");
        Employee emp2 = (Employee) emp.clone();
        System.out.println(emp);
        System.out.println(emp2);
    }
}
