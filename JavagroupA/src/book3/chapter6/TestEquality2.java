package book3.chapter6;

public class TestEquality2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Nuvalin", "Moodley");
        Employee emp2 = new Employee(
                "Nuvalin", "Moodley");
        if (emp1.equals(emp2)) {
            System.out.println(
                    "These employees are the same.");
        }else{
                System.out.println(
                        "These are different employees.");
            }
        }
    }