package util;

import obj.Contact;

import static util.Input.getString;

public class ManageContacts {

    //Prompts user to input firstName, lastName, and phoneNumber, then builds new Contact object
    public static Contact addContact() {
        System.out.println("***********");
        System.out.println("New Contact");
        System.out.println("***********");
        String firstName = getString("Enter First Name: ");
        String lastName = getString("Enter Last Name: ");
        String phoneNumber = getString("Enter Phone Number: ");

        return new Contact(firstName, lastName, phoneNumber);
    }
}
