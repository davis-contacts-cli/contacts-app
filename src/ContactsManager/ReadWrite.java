package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {

    static Path filepath = Paths.get("./data/contacts.txt");

    static List<String> contactList;

    static ArrayList<Contacts> contacts = new ArrayList<>();

    public static void createContacts(){
        try {
            contactList = Files.readAllLines(filepath);
            for (String contact : contactList) {
                String[] split = contact.split("\\|");
                String[] name = split[0].split("\s");
                contacts.add(new Contacts(name[0], name[1], split[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
