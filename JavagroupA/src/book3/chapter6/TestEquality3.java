package book3.chapter6;

import book3.chapter5.Game;

public class TestEquality3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nuvalin", "Moodley");
        Employee2 emp2 = new Employee2("Nuvalin", "Moodley");

        if (emp1.equals(emp2)) {
            System.out.println(
                    "These employees are the same.");
        }else{
                System.out.println(
                        "These are different employees.");
            }
        }
    }