package o.after;

public class Accounts {
    public Employee create(Applicant person) {
        Employee employee = new Employee();

        employee.firstName = person.firstName;
        employee.lastName = person.lastName;
        employee.email = String.format("example@example.com", person.firstName, person.lastName);

        switch (person.typeOfEmployee) {
            case staff:
                break;
            case manager:
                employee.isManager = true;
                break;
            case executive:
                employee.isManager = true;
                employee.isExecutive = true;
                break;
        }

        return employee;
    }
}
