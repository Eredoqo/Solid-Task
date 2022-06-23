package s.after;

import java.util.Scanner;

public class Users {
    Scanner reader = new Scanner(System.in);
    private boolean checkForNull(String str) {
        if (str == null || str.isEmpty()) return true;
        return false;
    }

    public Person createUser() throws Exception {
        System.out.println("What is your first name: ");
        String name = reader.next();
        if (checkForNull(name)) {
            throw new Exception("Please provide a name");
        }

        System.out.println("What is your last name: ");
        String surname = reader.next();
        if (checkForNull(surname)) {
            throw new Exception("Please provide a surname");
        }

        Person cperson = new Person();
        cperson.setFirstName(name);
        cperson.setLastName(surname);
        return cperson;
    }
}
