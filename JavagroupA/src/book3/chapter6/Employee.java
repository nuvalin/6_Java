package book3.chapter6;

public class Employee {


    private final String firstName;
    private final String lastName;

    public Employee(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' + '}';
    }

    public boolean equals(Object emp) {
        if (this == emp) {
            return true;
        }
        if (emp == null) {
            return false;
        }
        if (emp instanceof Employee e) {
            return (this.firstName.equals(e.firstName)) && (this.lastName.equals(e.lastName));
        }
        return false;

    }
@Override
    public  Object clone() {
        Employee emp;
        emp = new Employee( this.firstName,this.lastName);
        return emp;
    }


}
