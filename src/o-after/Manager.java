package o.after;

public class Manager extends Employee implements EmployeeRole {

    public Manager(String firstName, String lastName, String email, boolean isManager, boolean isExecutive) {
        super(firstName, lastName, email, isManager, isExecutive);
    }

    public Manager() {
        super();

    }

    @Override
    public void setEmployeeRole() {
        this.isManager = true;
    }
}
