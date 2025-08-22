package book4.chapter3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 implements Iterable {
    public static void main(String[] args) {
//        ArrayList signs = new ArrayList();
//        ArrayList signs = new ArrayList(100);
//
//        signs.add(88);
//        signs.add("hi");
//        System.out.println(signs);
//        ArrayList<String> signs = new ArrayList<>();
//        signs.add("Nuvalin");
//        Employee emp = new Employee("Moodley", "Nuvalin");
//        signs.add(emp.toString());
//        System.out.println(signs);
//
//        ArrayList<Employee> sign = new ArrayList<>();
//        sign.add("Nuvalin");
//        Employee emp1 = new Employee("Moodley", "Nuvalin");
//        sign.add(emp1);
//        System.out.println(sign);
//
//        ArrayList<String> nums = new ArrayList<>(2);
//        nums.add("One");
//        nums.add("Two");
//        nums.add("Three");
//        nums.add("Four");
//        System.out.println(nums);
//        nums.add(10,"Eleven");// error no index 10
//
//        for (int i = 0; i < nums.size(); i++)
//            System.out.println(nums.get(i));
//
//        for (String e : nums) {
//            int i = nums.indexOf(e);
//            System.out.println("Item " + i + ": " + e);
//        }
//
//
//        Iterator e = nums.iterator();
//        while (e.hasNext())
//        {
//            String s = (String)e.next();
//            System.out.println(s);
//        }
//        String first = nums.set(0, "Uno");
//        String second = nums.set(0, "Uno");
//        String third = nums.set(1, "Dos");
//        nums.set(2, "Tres");
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        System.out.println(nums);
//
//        ArrayList<String> newItems = new ArrayList<>( 4);
//        newItems.add("Uno");
//        newItems.add("Dod");
//        newItems.add("Tres");
//        newItems.add("Cuatro");
//
//        for (int i = 0; i < nums.size(); i++)
//           System.out.println(nums.set(i, newItems.get(i)));
//
//        System.out.println(nums);

        ArrayList<Employee> emps = new ArrayList<>();
        ArrayList<Employee> empp1 = new ArrayList<>();
        Employee emp1 = new Employee ("Addams","Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        empp1.add(emp1);
        empp1.add(emp2);
        empp1.add(emp3);

        System.out.println(emps);
        emps.remove(emp2);
        System.out.println(emps);

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
class Employee{
    String lastname;
    String firstname;
    public Employee(String lastname, String firstname){
        this.firstname = firstname;
        this.lastname = lastname;

    }
    public String toString(){
        return this.lastname + " " + this.firstname;
    }
}