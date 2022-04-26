package util;

import obj.Contact;

import java.util.HashMap;

import static consoleOut.DisplayContact.*;
import static util.Input.getString;

public class ManageContacts {

//    static HashMap<String, Contact> contactHashMap = new HashMap<>();

    //Prompts user to input firstName, lastName, and phoneNumber, then builds new Contact object
    public static Contact addContact() {
        System.out.println("\n");
        System.out.println(ANSI_PURPLE
                + "***********" + ANSI_RESET);
        System.out.println(ANSI_PURPLE
                + "New Contact" + ANSI_RESET);
        System.out.println(ANSI_PURPLE
                + "***********" + ANSI_RESET);
        String firstName = getString("Enter First Name: ");
        String lastName = getString("Enter Last Name: ");
        String phoneNumber = getString("Enter Phone Number (no dashes or spaces): ");
        System.out.println("\n");

        return new Contact(firstName, lastName, phoneNumber);
    }

    public static void removeContact(HashMap<String, Contact> contactsMap) {
        System.out.println("\n");
        boolean userContinue;
        do {
            String key = getString(ANSI_YELLOW + "Which contact would you like to remove?" + ANSI_RESET).toUpperCase();
            if (contactsMap.containsKey(key)) {
                contactsMap.remove(key);
                System.out.println(key + ANSI_YELLOW + "\ncontact has been removed!" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "\nContacts Updated!" + ANSI_RESET);
                userContinue = true;
            } else {
                System.out.println(key + ANSI_RED + "\n doesn't exist... Please try again" + ANSI_RESET);
                userContinue = false;
            }
        } while (!userContinue);
    }

}
