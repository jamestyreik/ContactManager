package app;

import obj.Contact;
import java.util.HashMap;
import static consoleOut.DisplayContact.*;
import static util.ManageContacts.addContact;
import static util.ManageContacts.removeContact;

public class ContactManagerRunner {
    public static void main(String[] args) {
        //Assigns hardcoded HashMap from getContacts to HashMap testMap
        HashMap<String, Contact> testMap = getContacts();
        //Takes in testMap and displays all keys (firstName and lastName)
        initContacts(testMap);
        //Prompts user to enter firstName, lastName, and phoneNumber to create new Contact object (testContact)
        Contact testContact = addContact();
        //Takes testMap and adds the testContact just made by the user
        testMap.put(testContact.getFirstName() + " " + testContact.getLastName(), testContact);
        //Takes in testMap and displays all keys (firstName and lastName) including new user created contact
        initContacts(testMap);

        removeContact(testMap);

        initContacts(testMap);

    }

    //Creates HashMap of Contacts as values and adds them with firstName and lastName as their keys
    public static HashMap<String, Contact> getContacts() {
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
