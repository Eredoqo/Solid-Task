package o.after;

public class Employee {
    String firstName;
    String lastName;
    String email;
    boolean isManager;
    boolean isExecutive;

    public Employee(String firstName, String lastName, String email, boolean isManager, boolean isExecutive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isManager = isManager;
        this.isExecutive = isExecutive;
    }

    public Employee() {

    }

    public void setEmployeeRole() {
    }
}
