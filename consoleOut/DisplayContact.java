package consoleOut;

import obj.Contact;

import java.util.HashMap;

import static util.Input.getString;

public class DisplayContact {
    //Formats individual Contact object for console display
    public static void displayContact(Contact contact) {
        System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
        System.out.println("Phone: " + contact.getPhoneNumber());
    }

    //Searches HashMap of Contacts by key provided by user and returns Contact Object
    public static Contact searchUserContact(HashMap<String, Contact> contactsMap) {
        String contact = getString("Which contact would you like to view?");
        return contactsMap.get(contact);
    }

    public static void initContacts(HashMap<String, Contact> contactsMap) {
        System.out.println("Users in memory: ");
        System.out.println("\n");
        for(String key : contactsMap.keySet()) {
            System.out.println(key);
        }
    }



}
