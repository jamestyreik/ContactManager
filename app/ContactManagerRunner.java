package app;

import obj.Contact;


import java.util.*;

import static consoleOut.DisplayContact.*;
import static consoleOut.Menu.displayMenu;
import static util.ManageContacts.addContact;
import static util.ManageContacts.removeContact;
import static util.TextEffects.*;


public class ContactManagerRunner {
    public static void main(String[] args) {
        HashMap<String, Contact> testMap = getContacts();
        printLogo2();
        boolean userContinue;
        do {
            switch (displayMenu()) {
                case 1:
                    //Display Contacts
                    initContacts(testMap);
                    userContinue = true;
                    break;
                case 2:
                    //Add Contact
                    Contact newContact = addContact();
                    testMap.put(newContact.getFirstName().toUpperCase() + " " + newContact.getLastName().toUpperCase(), newContact);
                    userContinue = true;
                    break;
                case 3:
                    initContacts(testMap);
                    displayContact(searchUserContact(testMap));
                    userContinue = true;
                    break;
                case 4:
                    initContacts(testMap);
                    removeContact(testMap);
                    System.out.println("Contacts Updated!");
                    initContacts(testMap);
                    userContinue = true;
                    break;
                default:
                    printBender();
                    userContinue = false;
            }
        } while (userContinue);

    }

    public static void convertHashMapToJson(HashMap<String, Contact> contactsMap) {
        Map<String, Contact> data = contactsMap;
        List<HashMap<String, Contact>> list = new ArrayList<>();
        list.add(contactsMap);
        List<String> keyList = new ArrayList<>();
        for (String key : contactsMap.keySet()) {
            keyList.add(key);
        }
        for (int i = 0; i < keyList.size(); i++) {
            String currentKey = keyList.get(i);
            Contact currentContact = contactsMap.get(currentKey);
            String first = currentContact.getFirstName();
            String last = currentContact.getLastName();
            String phone = currentContact.getPhoneNumber();
        }
    }

    //Creates HashMap of Contacts as values and adds them with firstName and lastName as their keys
    public static HashMap<String, Contact> getContacts() {
        Contact james = new Contact("James", "Woodward", "3185507510");
        Contact tyreik = new Contact("Tyreik", "Williams", "1111111111");
        Contact carl = new Contact("Carl", "Watergarbage", "5555555555");
        Contact tina = new Contact("Tina", "Fey", "6666666666");
        Contact juan = new Contact("Juan", "Valdez", "8888675309");

        HashMap<String, Contact> contactsMap = new HashMap<>();

        contactsMap.put(james.getFirstName().toUpperCase() + " " + james.getLastName().toUpperCase(), james);
        contactsMap.put(tyreik.getFirstName().toUpperCase() + " " + tyreik.getLastName().toUpperCase(), tyreik);
        contactsMap.put(carl.getFirstName().toUpperCase() + " " + carl.getLastName().toUpperCase(), carl);
        contactsMap.put(tina.getFirstName().toUpperCase() + " " + tina.getLastName().toUpperCase(), tina);
        contactsMap.put(juan.getFirstName().toUpperCase() + " " + juan.getLastName().toUpperCase(), juan);

        return contactsMap;
    }
}
