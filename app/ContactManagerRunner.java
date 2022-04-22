package app;

import obj.Contact;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static consoleOut.DisplayContact.displayContact;
import static consoleOut.Menu.displayMenu;

public class ContactManagerRunner {
    public static void main(String[] args) {
//        displayMenu();
        initContacts(getContacts());
    }

    private static void initContacts(HashMap<String, Contact> contactsMap) {
        System.out.println("Users in memory: ");
        System.out.println("\n");
        for(String key : contactsMap.keySet()) {
            System.out.println(key);
        }
    }

    private static HashMap<String, Contact> getContacts() {
        Contact james = new Contact("James", "Woodward", "3185507510");
        Contact tyreik = new Contact("Tyreik", "Williams", "1111111111");
        Contact carl = new Contact("Carl", "Watergarbage", "5555555555");
        Contact tina = new Contact("Tina", "Fey", "6666666666");
        Contact juan = new Contact("Juan", "Valdez", "8888675309");

        HashMap<String, Contact> contactsMap = new HashMap<>();

        contactsMap.put(james.getFirstName() + " " + james.getLastName(), james);
        contactsMap.put(tyreik.getFirstName() + " " + tyreik.getLastName(), tyreik);
        contactsMap.put(carl.getFirstName() + " " + carl.getLastName(), carl);
        contactsMap.put(tina.getFirstName() + " " + tina.getLastName(), tina);
        contactsMap.put(juan.getFirstName() + " " + juan.getLastName(), juan);

        return contactsMap;
    }
}
