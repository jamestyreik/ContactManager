package consoleOut;

import obj.Contact;

import java.util.HashMap;
import java.io.*;

import static util.Input.getString;

public class DisplayContact {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";


    //Formats individual Contact object for console display
    public static void displayContact(Contact contact) {
        System.out.println("\n");
        try{
            System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
            System.out.println("Phone: " + contact.getPhoneNumber());

        }catch(NullPointerException ex){
            System.out.println(ANSI_RED + "Sorry..." + ANSI_RESET);
        }

    }

    //Searches HashMap of Contacts by key provided by user and returns Contact Object
    public static Contact searchUserContact(HashMap<String, Contact> contactsMap) {
        System.out.println("\n");
        boolean userContinue;
        do {
            String contact = getString(  ANSI_YELLOW + "Which contact would you like to view?" + ANSI_RESET).toUpperCase();
            if (contactsMap.containsKey(contact)) {
                userContinue = true;
                return contactsMap.get(contact);
            } else {
                System.out.println(ANSI_RED + "That user does not exist. Please search again!" + ANSI_RESET);
                userContinue = false;
            }
            return contactsMap.get(contact);
        } while (!userContinue);
    }

    public static void initContacts(HashMap<String, Contact> contactsMap) {
        System.out.println("\n");
        System.out.println(ANSI_YELLOW + "Contacts:" + ANSI_RESET);
//        System.out.println("\n");
        for (String key : contactsMap.keySet()) {
            System.out.println(key);
        }
    }


}
