package app;

import obj.Contact;


import java.util.*;

import static consoleOut.DisplayContact.*;
import static util.ManageContacts.addContact;
import static util.ManageContacts.removeContact;

public class ContactManagerRunner {
    public static void main(String[] args) {
        //Assigns hardcoded HashMap from getContacts to HashMap testMap
        HashMap<String, Contact> testMap = getContacts();
//        //Takes in testMap and displays all keys (firstName and lastName)
//        initContacts(testMap);
//        //Prompts user to enter firstName, lastName, and phoneNumber to create new Contact object (testContact)
//        Contact testContact = addContact();
//        //Takes testMap and adds the testContact just made by the user
//        testMap.put(testContact.getFirstName().toUpperCase() + " " + testContact.getLastName().toUpperCase(), testContact);
//        //Takes in testMap and displays all keys (firstName and lastName) including new user created contact
//        initContacts(testMap);
//
//        removeContact(testMap);
//
//        initContacts(testMap);
        convertHashMapToJson(testMap);

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
