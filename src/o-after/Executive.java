package o.after;

public class Executive extends Employee implements EmployeeRole{

    public Executive(String firstName, String lastName, String email, boolean isManager, boolean isExecutive) {
        super(firstName, lastName, email, isManager, isExecutive);
    }

    public Executive() {

    }

    @Override
    public void setEmployeeRole() {
        this.isManager = true;
        this.isExecutive = true;
    }
}
