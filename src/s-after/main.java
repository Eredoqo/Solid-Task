package s.after;


public class main {
    public static <User> void main(String[] args) {


        System.out.println("Welcome to my application");

        Person person = new Person();
        Users user = new Users();


        person = user.createPerson();
        person.printUserName();

        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            System.out.println("You did not give us a valid first name!");
        }

        if (person.getLastName() == null || person.getLastName().isEmpty()) {
            System.out.println("You did not give us a valid last name!");
        }

        System.out.println("End of application");
    }
}
