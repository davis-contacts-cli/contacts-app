package ContactsManager;

import java.util.Scanner;

public class ContactsManagerApp {
    static Scanner input = new Scanner(System.in);

    public static void choiceMade(int choice) {
        switch (choice) {
            case 1:
                ReadWrite.readContacts();
                System.out.println("Can I assist you further?\n1: Display all contacts\n2: Add new contact\n3: Delete contact\n4: Contact search\n5: Quit");
                int readChoice = input.nextInt();
                choiceMade(readChoice);
                break;
            case 2:
                System.out.println("Enter first name:");
                String first = input.next();
                System.out.println("Enter last name:");
                String last = input.next();
                System.out.println("Enter contact number");
                String number = input.next();
                ReadWrite.writeContact(first,last,number);
                System.out.printf("%s, %s added to your contacts list\n", last, first);
                System.out.println("Can I assist you further?\n1: Display all contacts\n2: Add new contact\n3: Delete contact\n4: Contact search\n5: Quit");
                int addChoice = input.nextInt();
                choiceMade(addChoice);
                break;
            case 3:
                System.out.println("Delete which contact?");
                String deletion = input.next();
                ReadWrite.deleteContact(deletion);
                System.out.println("Can I assist you further?\n1: Display all contacts\n2: Add new contact\n3: Delete contact\n4: Contact search\n5: Quit");
                int deleteChoice = input.nextInt();
                choiceMade(deleteChoice);
                break;
            case 4:
                System.out.println("Enter search term");
                String search = input.next();
                Contact found = ReadWrite.searchContact(search);
                if (found == null){
                    System.out.println("Contact not found");
                } else {
                    System.out.printf("%s | %s\n", found.getName(), found.getNumber());
                }
                System.out.println("Can I assist you further?\n1: Display all contacts\n2: Add new contact\n3: Delete contact\n4: Contact search\n5: Quit");
                int searchChoice = input.nextInt();
                choiceMade(searchChoice);
                break;
            case 5:
                System.out.println("Are you sure you want to quit?\n(yes/no)");
                String quit = input.next();
                if (quit.equalsIgnoreCase("yes")){
                    ReadWrite.cleanEnd();
                    break;
                } else {
                    System.out.println("Input not recognized. Please select a valid option.");
                    System.out.println("Can I assist you further?\n1: Display all contacts\n2: Add new contact\n3: Delete contact\n4: Contact search\n5: Quit");
                    int newChoice = input.nextInt();
                    choiceMade(newChoice);
                }
            default:
                System.out.println("Input not recognized. Please select a valid option.");
                System.out.println("Can I assist you further?\n1: Display all contacts\n2: Add new contact\n3: Delete contact\n4: Contact search\n5: Quit");
                int newChoice = input.nextInt();
                choiceMade(newChoice);
        }
    }

    public static void main(String[] args) {
        ReadWrite.createContacts();
        System.out.println("Welcome to Contacts Manager, how can I assist you?\n1: Display all contacts\n2: Add new contact\n3: Delete contact\n4: Contact search\n5: Quit");
        int choice = input.nextInt();
        choiceMade(choice);
    }

}
