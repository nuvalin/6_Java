package book3.chapter6;

public class Employee2 {


    private final String firstName;
    private final String lastName;

    public Employee2(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }
    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' + '}';
    }

    public boolean equals(Object emp){
        if(emp instanceof Employee) {
            Employee2 e = (Employee2) emp;
            return (this.firstName.equals(e.firstName)) && (this.lastName.equals(e.lastName));
        }
        return false;

    }


}

