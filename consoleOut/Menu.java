package consoleOut;

import static util.Input.getInt;

public class Menu {

    //displays the main menu and returns an integer
    public static int displayMenu() {
        System.out.println("\n" +
                "Make a Selection:\n" +
                "1. View Contacts\n" +
                "2. Add a new contact\n" +
                "3. Search a contact by name\n" +
                "4. Delete an existing contact\n" +
                "5. Exit!\n");

        return getInt("Enter an option (1,2,3,4,5)");
    }

}
