package util;

import obj.Contact;

import java.util.HashMap;

import static consoleOut.DisplayContact.*;
import static util.Input.getString;

public class ManageContacts {

    //Prompts user to input firstName, lastName, and phoneNumber, then builds new Contact object
    public static Contact addContact() {
        System.out.println("Would you like to create a new contact? (Y/N)");

        System.out.println(ANSI_PURPLE
                + "***********" + ANSI_RESET);
        System.out.println(ANSI_PURPLE
                + "New Contact" + ANSI_RESET);
        System.out.println(ANSI_PURPLE
                + "***********" + ANSI_RESET);
        String firstName = getString("Enter First Name: ");
        String lastName = getString("Enter Last Name: ");
        String phoneNumber = getString("Enter Phone Number: ");

        return new Contact(firstName, lastName, phoneNumber);
    }

    public static void removeContact(HashMap<String, Contact> contactsMap) {
       boolean userContinue;
        do {
           String key = getString("Which contact would you like to remove?").toUpperCase();
            if (contactsMap.containsKey(key)) {
                contactsMap.remove(key);
                System.out.println(key + " contact has been removed!");
                userContinue = true;
            } else {
                System.out.println(key + " doesn't exist... Please try again");
                userContinue = false;
            }
        } while (!userContinue);
    }

}
