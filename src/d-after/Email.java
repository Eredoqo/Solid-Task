package d.after;

public class Email implements MessagingOpt {

    @Override
    public void sendEmail(Person person, String message) {
        System.out.printf("Simulating sending an email to %s", person.email);
    }
}
