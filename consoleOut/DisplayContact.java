package consoleOut;

import obj.Contact;

public class DisplayContact {
    public static void displayContact(Contact contact) {
        System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
        System.out.println("Phone: " + contact.getPhoneNumber());
    }

}
