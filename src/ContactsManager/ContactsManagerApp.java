package ContactsManager;

import static ContactsManager.ReadWrite.contacts;
import static ContactsManager.ReadWrite.createContacts;

public class ContactsManagerApp {
    public static void main(String[] args) {
        createContacts();
        for (Contacts contact: contacts){
            System.out.printf("Contact: %s at Number: %s\n",contact.getName(), contact.getNumber());
        }
    }
}
