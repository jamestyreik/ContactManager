package app;

import fileio.ReadWrite;
import obj.Contact;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static consoleOut.DisplayContact.*;
import static consoleOut.Menu.displayMenu;
import static fileio.ReadWrite.*;
import static util.ManageContacts.addContact;
import static util.ManageContacts.removeContact;
import static util.TextEffects.*;


public class ContactManagerRunner {
    public static void main(String[] args) {
        //New HashMap is created from json file
        HashMap<String, Contact> workingMap = contactsMapMaker(Paths.get("data/contacts.json"));
        //Initial HashMap used to populate json and used for testing prior to read/write capability
//        HashMap<String, Contact> testMap = getContacts();
        printLogo2();
        boolean userContinue;
        do {
            switch (displayMenu()) {
                case 1:
                    //Display Contacts
                    initContacts(workingMap);
                    userContinue = true;
                    break;
                case 2:
                    //Add Contact
                    Contact newContact = addContact();
                    workingMap.put(newContact.getFirstName().toUpperCase() + " " + newContact.getLastName().toUpperCase(), newContact);
                    userContinue = true;
                    break;
                case 3:
                    initContacts(workingMap);
                    displayContact(searchUserContact(workingMap));
                    userContinue = true;
                    break;
                case 4:
                    initContacts(workingMap);
                    removeContact(workingMap);
                    initContacts(workingMap);
                    userContinue = true;
                    break;
                case 5:
                    tryWriteFile(Paths.get("data/contacts.json"), new ArrayList<>(workingMap.values()));
                    printBender();
                    userContinue = false;
                    break;
                default:
                    System.out.println("Please enter a valid selection");
                    userContinue = true;
            }
        } while (userContinue);

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
