package ContactsManager;

public class Contacts {

    private final String firstName;
    private final String lastName;
    private final String number;

    public Contacts(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getName() {
        return this.lastName + ", " + this.firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }
}
