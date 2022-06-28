package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadWrite {

    static Path filepath = Paths.get("./data/contacts.txt");

    static List<String> contactList;

    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void createContacts(){
        try {
            contactList = Files.readAllLines(filepath);
            for (String contact : contactList) {
                String[] split = contact.split("\\|");
                String[] name = split[0].split("\s");
                contacts.add(new Contact(name[0], name[1], split[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readContacts(){
        for (Contact contact: contacts){
            System.out.printf("Contact: %s at Number: %s\n",contact.getName(), contact.getNumber());
        }
    }

    public static void writeContact(String firstName, String lastName, String number){
        contacts.add(new Contact(firstName, lastName, number));
        String contactString = firstName + " " + lastName + "|" + number;
        try {
            Files.write(
                    Paths.get("data", "contacts.txt"),
                    List.of(contactString), // list with one item
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static contacts =
}
